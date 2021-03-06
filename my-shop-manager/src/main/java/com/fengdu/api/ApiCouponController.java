package com.fengdu.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengdu.controller.BaseController;
import com.fengdu.entity.HistroyPriceResp;
import com.fengdu.entity.HistroyPriceRespNew;
import com.fengdu.entity.JingdongCouponResp;
import com.fengdu.entity.TaobaoCouponResp;
import com.fengdu.entity.resp.TaobaoInfoResp;
import com.fengdu.utils.HttpClientUtil;
import com.fengdu.utils.R;
import com.fengdu.utils.UrlUtils;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/api/coupon")
public class ApiCouponController extends BaseController {

    private HistroyPriceResp getHistroyPrice(String url) {
        try {
            String histrotyUrl = "https://www.yhmai.cn/api/history?url=" + url;
            String ret = HttpClientUtil.sendChromGet(histrotyUrl, null);
            HistroyPriceResp histroyPriceResp = JSON.toJavaObject(JSONObject.parseObject(ret), HistroyPriceResp.class);
            return histroyPriceResp;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private HistroyPriceResp getHistroyPriceNew(String encodeUrl) throws Exception {


        String decodeurl = URLDecoder.decode(encodeUrl, "utf-8");
        String taoPassword = null;
        if (!UrlUtils.isUrl(decodeurl)) {
            String regEx = "\\w{11}"; // 定义正则表达式
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(decodeurl);
            while (matcher.find()) {
                taoPassword = matcher.group();
                break;
            }
            if (!TextUtils.isEmpty(taoPassword)) {
                int intexPassword = decodeurl.indexOf(taoPassword);
                if (intexPassword != -1) {
                    int end = intexPassword + taoPassword.length() + 1;
                    int start = intexPassword - 1;
                    taoPassword = decodeurl.substring(start, end);
                }
            }
            if (TextUtils.isEmpty(taoPassword)) {
                throw new RuntimeException("链接格式错误");
            }
        }

        String encodeUrltarget = encodeUrl;

        if (!TextUtils.isEmpty(taoPassword)) {
            String goodsUrl = String.format("https://api.yhmai.cn/router?v=1&api=yhmai.taobao.query.tpwd&taoPassword=%s&_t=%s",
                    URLEncoder.encode(taoPassword, "utf-8"), System.currentTimeMillis() + "");
            //{	"data":"https://a.m.taobao.com/i594508621394.htm?sourceType=item&ttid=255200@taobao_android_9.4.0&ut_sk=1.XiAxax4bLZADADZkd3TidmYh_21646297_1582297456920.GoodsTitleURL.1&un=939d82bc7e58b13a5aa10d17ec7f1e53&share_crt_v=1&spm=a211b4.23149863&sp_tk=4oK0N0c4UjFmVFVLVmrigrQ=&visa=13a09278fde22a2e&disablePopup=true&disableSJ=1",	"message":"SUCCESS",	"status":200}
            String retGoodsInfo = HttpClientUtil.sendChromGet(goodsUrl, null);
            TaobaoInfoResp taobaoInfoResp = JSON.toJavaObject(JSONObject.parseObject(retGoodsInfo), TaobaoInfoResp.class);
            if (taobaoInfoResp != null && !TextUtils.isEmpty(taobaoInfoResp.getData())) {
                encodeUrltarget = URLEncoder.encode(taobaoInfoResp.getData(), "utf-8");
            } else {
                throw new RuntimeException("未查找到历史价格信息");
            }
        }
//        https://api.yhmai.cn/router?v=1&api=yhmai.query.history&url=http:%2F%2Fitem.jd.com%2F100004538398.html&_t=1589186513033

        String historyUrl = String.format("https://api.yhmai.cn/router?v=1&api=yhmai.query.history&url=%s&_t=%s",
                encodeUrltarget, System.currentTimeMillis() + "");
//        historyUrl ="https://api.yhmai.cn/router?v=1&api=yhmai.query.history&url=http:%2F%2Fitem.jd.com%2F100004538398.html&_t=1589186513033";
        String ret1 = HttpClientUtil.sendChromGet(historyUrl, null);
        System.out.println(ret1);
        HistroyPriceRespNew histroyPriceRespNew = JSON.toJavaObject(JSONObject.parseObject(ret1), HistroyPriceRespNew.class);
        HistroyPriceResp histroyPriceResp = histroyPriceRespNew.toJdHistroyPriceResp();
        return histroyPriceResp;

    }

    private JingdongCouponResp searchJingdongCoupon(String key, int coupon) {
        try {
            String souquanUrl = "http://xq.meifanfan.com/api/Jd/search";
            Map<String, String> params = new HashMap<>();
            params.put("page", "1");
            params.put("search_type", "jd_url");
            params.put("coupon", coupon + "");
            params.put("volume", "inOrderCount30Days");
            params.put("keyword", key);
            String ret = HttpClientUtil.post(souquanUrl, params);
            JingdongCouponResp jingdongCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), JingdongCouponResp.class);
            R rOk = R.ok();
            rOk.put("data", jingdongCouponResp.getData());
            return jingdongCouponResp;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private TaobaoCouponResp searchTaobaoCoupon(String key, int coupon) {
        try {
            String souquanUrl = "http://xq.meifanfan.com/api/Tb/search";
            Map<String, String> params = new HashMap<>();
            params.put("page", "1");
            params.put("coupon", coupon + "");
            params.put("keyword", key);
            String ret = HttpClientUtil.post(souquanUrl, params);
            TaobaoCouponResp taobaoCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), TaobaoCouponResp.class);
            R rOk = R.ok();
            rOk.put("data", taobaoCouponResp.getData());
            return taobaoCouponResp;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping("/historyPrice")
    @ResponseBody
    public R queryHistoryPrice() {
        String url = getStringParameter("url", null);
        if (TextUtils.isEmpty(url)) {
            return R.error("请输入商品链接");
        }
        try {
//            url = URLDecoder.decode(url, "utf-8");
            HistroyPriceResp histroyPriceResp = getHistroyPriceNew(url);
//            String title = histroyPriceResp.getData().getGoodTitle();
//            byte[] bArr = title.getBytes("gbk");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
//            String str1 = new String(bArr, "utf-8");  //utf16和unicode编码一样
//            histroyPriceResp.getData().setGoodTitle(str1);
            R rOk = R.ok();
            rOk.put("data", histroyPriceResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(e.getMessage());
        }
    }

    @RequestMapping("/historyPrice/taobao")
    @ResponseBody
    public R queryHistoryPriceTaobao() {
        String url = getStringParameter("url", null);
        if (TextUtils.isEmpty(url)) {
            return R.error("请输入商品链接");
        }
        try {
            url = URLDecoder.decode(url, "utf-8");
            HistroyPriceResp histroyPriceResp = getHistroyPrice(url);
            String goodsUrl = "https://item.taobao.com/item.htm?id=" + histroyPriceResp.getData().getGoodId();
            TaobaoCouponResp taobaoCouponResp = searchTaobaoCoupon(goodsUrl, 0);
            R rOk = R.ok();
            Map paramRet = new HashMap();
            paramRet.put("historyPrice", histroyPriceResp.getData());
            paramRet.put("coupon", taobaoCouponResp);
            rOk.put("data", paramRet);
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        R rOk = R.ok();
        return rOk;
    }

    @RequestMapping("/historyPrice/jingdong")
    @ResponseBody
    public R queryHistoryPricejingdong() {
        String url = getStringParameter("url", null);
        if (TextUtils.isEmpty(url)) {
            return R.error("请输入商品链接");
        }
        try {
            url = URLDecoder.decode(url, "utf-8");
            HistroyPriceResp histroyPriceResp = getHistroyPrice(url);
            R rOk = R.ok();
            String goodsUrl = "https://item.jd.com/" + histroyPriceResp.getData().getGoodId() + ".html";
            JingdongCouponResp jingdongCouponResp = searchJingdongCoupon(goodsUrl, 0);
            Map paramRet = new HashMap();
            paramRet.put("historyPrice", histroyPriceResp.getData());
            paramRet.put("coupon", jingdongCouponResp.getData());
            rOk.put("data", paramRet);
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        R rOk = R.ok();
        return rOk;
    }


    @RequestMapping("/souquan/jingdong")
    @ResponseBody
    public R souquanJingdong() {
        String keywords = getStringParameter("keywords", null);
        int coupon = getIntegerParameter("coupon", 0);
        if (TextUtils.isEmpty(keywords)) {
            return R.error("搜索内容不能为空");
        }
        try {
            keywords = URLDecoder.decode(keywords, "utf-8");
            JingdongCouponResp jingdongCouponResp = searchJingdongCoupon(keywords, coupon);
            R rOk = R.ok();
            rOk.put("data", jingdongCouponResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return R.error("未搜索到商品信息");
    }

    @RequestMapping("/souquan/taobao")
    @ResponseBody
    public R souquanTaobao() {
        String keywords = getStringParameter("keywords", null);
        int coupon = getIntegerParameter("coupon", 0);
        if (TextUtils.isEmpty(keywords)) {
            return R.error("搜索内容不能为空");
        }
        try {
            keywords = URLDecoder.decode(keywords, "utf-8");
            TaobaoCouponResp taobaoCouponResp = searchTaobaoCoupon(keywords, coupon);
            R rOk = R.ok();
            rOk.put("data", taobaoCouponResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return R.error("未搜索到商品信息");
    }

    public static void main(String[] args) {

        try {

            String decodeurl = "复置这行话¢vmyM1f3QrSi¢转移至淘宀┡ē【预售 李子柒柳州螺蛳粉广西特产正宗螺丝粉方便面米线酸辣粉3包】；或https://m.tb.cn/h.V2eRvSW?sm=4b7a0d 掂击链街，再选择瀏→覽→噐咑№亓";
            String regEx = "\\w{11}"; // 定义正则表达式
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(decodeurl);
            String taoPassword = null;
            while (matcher.find()) {
                taoPassword = matcher.group();
                int intexPassword = decodeurl.indexOf(taoPassword);
                if (intexPassword != -1) {
                    int end = intexPassword + taoPassword.length() + 1;
                    int start = intexPassword - 1;
                    taoPassword = decodeurl.substring(start, end);
                }
                break;
            }

//            String histrotyUrl = "http://www.yhmai.cn/api/history?url=https://item.jd.com/1590386.html";
//            String ret = HttpClientUtil.sendChromGet(histrotyUrl, null);
//            HistroyPriceResp histroyPriceResp = JSON.toJavaObject(JSONObject.parseObject(ret), HistroyPriceResp.class);
//            String title = histroyPriceResp.getData().getGoodTitle();
//            byte[] bArr = title.getBytes("ISO-8859-1");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
//            byte[] bArr2 = title.getBytes("GBK");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
//            String str1 = new String(bArr, "UTF-8");  //utf16和unicode编码一样
//            String str2 = new String(bArr2, "UTF-8");  //utf16和unicode编码一样
//            histroyPriceResp.getData().setGoodTitle(str1);
//            R rOk = R.ok();
//            rOk.put("data", histroyPriceResp.getData());


            String historyUrl = "http://api.yhmai.cn/router?v=1&api=yhmai.query.history&url=https://detail.tmall.com/item.htm?id=602695578857&_t=" + System.currentTimeMillis();
            String ret1 = HttpClientUtil.sendChromGet(historyUrl, null);
//            String goodInfoUrl = "http://api.yhmai.cn/router?v=1&api=yhmai.jingdong.query.good.info&url=https://item.jd.com/100008348542.html&_t="+System.currentTimeMillis();
//            String ret2 = HttpClientUtil.sendChromGet(goodInfoUrl, null);
//            System.out.print("ret1:"+ret1);
//            System.out.print("ret2:"+ret2);

            HistroyPriceRespNew histroyPriceRespNew = JSON.toJavaObject(JSONObject.parseObject(ret1), HistroyPriceRespNew.class);
            HistroyPriceResp histroyPriceResp = histroyPriceRespNew.toJdHistroyPriceResp();
            System.out.print("ret2:" + ret1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        String souquanUrl = "http://xq.meifanfan.com/api/Tb/search";
        String keywords = "透明餐桌垫pvc软玻璃桌布防水防油免洗防烫厚茶几垫子塑料水晶板";
        if (TextUtils.isEmpty(keywords)) {
            return;
        }
        try {
            Map<String, String> params = new HashMap<>();
            params.put("page", "1");
//            params.put("coupon", "0");
            params.put("volume", "total_sales_desc");
            params.put("keyword", keywords);

            String ret = HttpClientUtil.post(souquanUrl, params);
            System.out.print(ret);
            TaobaoCouponResp taobaoCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), TaobaoCouponResp.class);
            R rOk = R.ok();
            rOk.put("data", taobaoCouponResp.getData());


            System.out.print("---------------------------------------------------------------------------");
            System.out.print("---------------------------------------------------------------------------");
            System.out.print("---------------------------------------------------------------------------");

            souquanUrl = "http://xq.meifanfan.com/api/Jd/search";
            keywords = "手机";
            if (TextUtils.isEmpty(keywords)) {
                return;
            }
            try {
                params = new HashMap<>();
                params.put("page", "1");
                params.put("search_type", "jd_url");
                params.put("coupon", "0");
                params.put("volume", "inOrderCount30Days");
//            search_type=jd_url&keyword=%E6%89%8B%E6%9C%BA&coupon=0&volume=inOrderCount30Days&relationId=2317068823
                params.put("keyword", keywords);
                ret = HttpClientUtil.post(souquanUrl, params);
                System.out.print(ret);
                JingdongCouponResp jingdongCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), JingdongCouponResp.class);
                rOk = R.ok();
                rOk.put("data", jingdongCouponResp.getData());

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
