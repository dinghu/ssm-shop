package com.fengdu.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengdu.controller.BaseController;
import com.fengdu.entity.HistroyPriceResp;
import com.fengdu.entity.JingdongCouponResp;
import com.fengdu.entity.TaobaoCouponResp;
import com.fengdu.utils.HttpClientUtil;
import com.fengdu.utils.R;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/coupon")
public class ApiCouponController extends BaseController {

    private HistroyPriceResp getHistroyPrice(String url) {
        try {
            String histrotyUrl = "http://www.yhmai.cn/api/history?url=" + url;
            String ret = HttpClientUtil.sendChromGet(histrotyUrl, null);
            HistroyPriceResp histroyPriceResp = JSON.toJavaObject(JSONObject.parseObject(ret), HistroyPriceResp.class);
            return histroyPriceResp;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
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
            HistroyPriceResp histroyPriceResp = getHistroyPrice(url);
//            String title = histroyPriceResp.getData().getGoodTitle();
//            byte[] bArr = title.getBytes("gbk");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
//            String str1 = new String(bArr, "utf-8");  //utf16和unicode编码一样
//            histroyPriceResp.getData().setGoodTitle(str1);
            R rOk = R.ok();
            rOk.put("data", histroyPriceResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        R rOk = R.ok();
        return rOk;
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
            String histrotyUrl = "http://www.yhmai.cn/api/history?url=https://item.jd.com/1590386.html";
            String ret = HttpClientUtil.sendChromGet(histrotyUrl, null);
            HistroyPriceResp histroyPriceResp = JSON.toJavaObject(JSONObject.parseObject(ret), HistroyPriceResp.class);
            String title = histroyPriceResp.getData().getGoodTitle();
            byte[] bArr = title.getBytes("ISO-8859-1");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
            byte[] bArr2 = title.getBytes("GBK");  //bArr[0]=fe,bArr[1]=ff;从bArr[2]开始为编码内容
            String str1 = new String(bArr, "UTF-8");  //utf16和unicode编码一样
            String str2 = new String(bArr2, "UTF-8");  //utf16和unicode编码一样
            histroyPriceResp.getData().setGoodTitle(str1);
            R rOk = R.ok();
            rOk.put("data", histroyPriceResp.getData());

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
