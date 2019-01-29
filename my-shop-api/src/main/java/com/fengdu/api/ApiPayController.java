package com.fengdu.api;

import com.fengdu.annotation.LoginUser;
import com.fengdu.entity.OrderGoodsVo;
import com.fengdu.entity.OrderVo;
import com.fengdu.entity.UserVo;
import com.fengdu.service.ApiOrderGoodsService;
import com.fengdu.service.ApiOrderService;
import com.fengdu.util.ApiBaseAction;
import com.fengdu.util.wechat.WechatRefundApiResult;
import com.fengdu.util.wechat.WechatUtil;
import com.fengdu.utils.CharUtil;
import com.fengdu.utils.DateUtils;
import com.fengdu.utils.MapUtils;
import com.fengdu.utils.ResourceUtil;
import com.fengdu.utils.XmlUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 作者: @author Harmon <br>
 * 时间: 2017-08-11 08:32<br>
 * 描述: ApiIndexController <br>
 */
@RestController
@RequestMapping("/api/pay")
@Api(value = "支付模块接口->api", tags = { "支付接口Controller" })
public class ApiPayController extends ApiBaseAction {
    private Logger logger = Logger.getLogger(getClass());
    @Autowired
    private ApiOrderService orderService;
    @Autowired
    private ApiOrderGoodsService orderGoodsService;

    /**
     */
    @RequestMapping("index")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public Object index(@LoginUser UserVo loginUser) {
        //
        return toResponsSuccess("");
    }

    /**
     * 获取支付的请求参数
     */
    @RequestMapping("prepay")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public Object payPrepay(@LoginUser UserVo loginUser, Integer orderId) {
        //
        OrderVo orderInfo = orderService.queryObject(orderId);

        if (null == orderInfo) {
            return toResponsObject(400, "订单已取消", "");
        }

        if (orderInfo.getPay_status() != 0) {
            return toResponsObject(400, "订单已支付，请不要重复操作", "");
        }

        String nonceStr = CharUtil.getRandomString(32);

        //https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=3
        Map<Object, Object> resultObj = new TreeMap();

        try {
            Map<Object, Object> parame = new TreeMap<Object, Object>();
            parame.put("appid", ResourceUtil.getConfigByName("wx.appId"));
            // 商家账号。
            parame.put("mch_id", ResourceUtil.getConfigByName("wx.mchId"));
            String randomStr = CharUtil.getRandomNum(18).toUpperCase();
            // 随机字符串
            parame.put("nonce_str", randomStr);
            // 商户订单编号
            parame.put("out_trade_no", orderId);
            Map orderGoodsParam = new HashMap();
            orderGoodsParam.put("order_id", orderId);
            // 商品描述
            parame.put("body", "超市-支付");
            //订单的商品
            List<OrderGoodsVo> orderGoods = orderGoodsService.queryList(orderGoodsParam);
            if (null != orderGoods) {
                String body = "超市-";
                for (OrderGoodsVo goodsVo : orderGoods) {
                    body = body + goodsVo.getGoods_name() + "、";
                }
                if (body.length() > 0) {
                    body = body.substring(0, body.length() - 1);
                }
                // 商品描述
                parame.put("body", body);
            }
            //支付金额
            parame.put("total_fee", orderInfo.getActual_price().multiply(new BigDecimal(100)).intValue());
            // 回调地址
            parame.put("notify_url", ResourceUtil.getConfigByName("wx.notifyUrl"));
            // 交易类型APP
            parame.put("trade_type", ResourceUtil.getConfigByName("wx.tradeType"));
            parame.put("spbill_create_ip", getClientIp());
            parame.put("openid", loginUser.getWeixin_openid());
            String sign = WechatUtil.arraySign(parame, ResourceUtil.getConfigByName("wx.paySignKey"));
            // 数字签证
            parame.put("sign", sign);

            String xml = MapUtils.convertMap2Xml(parame);
            logger.info("xml:" + xml);
            Map<String, Object> resultUn = XmlUtil.xmlStrToMap(WechatUtil.requestOnce(ResourceUtil.getConfigByName("wx.uniformorder"), xml));
            // 响应报文
            String return_code = MapUtils.getString("return_code", resultUn);
            String return_msg = MapUtils.getString("return_msg", resultUn);
            //
            if (return_code.equalsIgnoreCase("FAIL")) {
                return toResponsFail("支付失败," + return_msg);
            } else if (return_code.equalsIgnoreCase("SUCCESS")) {
                // 返回数据
                String result_code = MapUtils.getString("result_code", resultUn);
                String err_code_des = MapUtils.getString("err_code_des", resultUn);
                if (result_code.equalsIgnoreCase("FAIL")) {
                    return toResponsFail("支付失败," + err_code_des);
                } else if (result_code.equalsIgnoreCase("SUCCESS")) {
                    String prepay_id = MapUtils.getString("prepay_id", resultUn);
                    // 先生成paySign 参考https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_7&index=5
                    resultObj.put("appId", ResourceUtil.getConfigByName("wx.appId"));
                    resultObj.put("timeStamp", DateUtils.timeToStr(System.currentTimeMillis() / 1000, DateUtils.DATE_TIME_PATTERN));
                    resultObj.put("nonceStr", nonceStr);
                    resultObj.put("package", "prepay_id=" + prepay_id);
                    resultObj.put("signType", "MD5");
                    String paySign = WechatUtil.arraySign(resultObj, ResourceUtil.getConfigByName("wx.paySignKey"));
                    resultObj.put("paySign", paySign);
                    // 业务处理
                    orderInfo.setPay_id(prepay_id);
                    // 付款中
                    orderInfo.setPay_status(1);
                    orderService.update(orderInfo);
                    return toResponsObject(0, "微信统一订单下单成功", resultObj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return toResponsFail("下单失败,error=" + e.getMessage());
        }
        return toResponsFail("下单失败");
    }

    /**
     * 微信订单回调接口
     *
     * @return
     */
    @RequestMapping(value = "/notify", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public void notify(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            response.setHeader("Access-Control-Allow-Origin", "*");
            InputStream in = request.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            out.close();
            in.close();
            //xml数据
            String reponseXml = new String(out.toByteArray(), "utf-8");

            WechatRefundApiResult result = (WechatRefundApiResult) XmlUtil.xmlStrToBean(reponseXml, WechatRefundApiResult.class);
            String result_code = result.getResult_code();
            if (result_code.equalsIgnoreCase("FAIL")) {
                //订单编号
                String out_trade_no = result.getOut_trade_no();
                logger.error("订单" + out_trade_no + "支付失败");
                response.getWriter().write(setXml("SUCCESS", "OK"));
            } else if (result_code.equalsIgnoreCase("SUCCESS")) {
                //订单编号
                String out_trade_no = result.getOut_trade_no();
                logger.error("订单" + out_trade_no + "支付成功");
                // 业务处理
                OrderVo orderInfo = orderService.queryObject(Integer.valueOf(out_trade_no));
                orderInfo.setPay_status(2);
                orderInfo.setOrder_status(201);
                orderInfo.setShipping_status(0);
                orderInfo.setPay_time(new Date());
                orderService.update(orderInfo);
                response.getWriter().write(setXml("SUCCESS", "OK"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    /**
     * 订单退款请求
     */
    @RequestMapping("refund")
    public Object refund(@LoginUser UserVo loginUser, Integer orderId) {
        //
        OrderVo orderInfo = orderService.queryObject(orderId);

        if (null == orderInfo) {
            return toResponsObject(400, "订单已取消", "");
        }

        if (orderInfo.getOrder_status() == 401 || orderInfo.getOrder_status() == 402) {
            return toResponsObject(400, "订单已退款", "");
        }

        if (orderInfo.getPay_status() != 2) {
            return toResponsObject(400, "订单未付款，不能退款", "");
        }

//        WechatRefundApiResult result = WechatUtil.wxRefund(orderInfo.getId().toString(),
//                orderInfo.getActual_price().doubleValue(), orderInfo.getActual_price().doubleValue());
        WechatRefundApiResult result = WechatUtil.wxRefund(orderInfo.getId().toString(),
                0.01, 0.01);
        if (result.getResult_code().equals("SUCCESS")) {
            if (orderInfo.getOrder_status() == 201) {
                orderInfo.setOrder_status(401);
            } else if (orderInfo.getOrder_status() == 300) {
                orderInfo.setOrder_status(402);
            }
            orderService.update(orderInfo);
            return toResponsObject(400, "成功退款", "");
        } else {
            return toResponsObject(400, "退款失败", "");
        }
    }


    //返回微信服务
    public static String setXml(String return_code, String return_msg) {
        return "<xml><return_code><![CDATA[" + return_code + "]]></return_code><return_msg><![CDATA[" + return_msg + "]]></return_msg></xml>";
    }

    //模拟微信回调接口
    public static String callbakcXml(String orderNum) {
        return "<xml><appid><![CDATA[wx2421b1c4370ec43b]]></appid><attach><![CDATA[支付测试]]></attach><bank_type><![CDATA[CFT]]></bank_type><fee_type><![CDATA[CNY]]></fee_type> <is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[10000100]]></mch_id><nonce_str><![CDATA[5d2b6c2a8db53831f7eda20af46e531c]]></nonce_str><openid><![CDATA[oUpF8uMEb4qRXf22hE3X68TekukE]]></openid> <out_trade_no><![CDATA[" + orderNum + "]]></out_trade_no>  <result_code><![CDATA[SUCCESS]]></result_code> <return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[B552ED6B279343CB493C5DD0D78AB241]]></sign><sub_mch_id><![CDATA[10000100]]></sub_mch_id> <time_end><![CDATA[20140903131540]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[1004400740201409030005092168]]></transaction_id></xml>";
    }
}