package com.fengdu.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fengdu.controller.BaseController;
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

    @RequestMapping("/souquan/jingdong")
    @ResponseBody
    public R souquanJingdong() {
        String souquanUrl = "http://xq.meifanfan.com/api/Jd/search";
        String keywords = getStringParameter("keywords", null);
        int coupon = getIntegerParameter("coupon", 0);
        if (TextUtils.isEmpty(keywords)) {
            return R.error("搜索内容不能为空");
        }
        try {
            keywords = URLDecoder.decode(keywords, "utf-8");
            Map<String, String> params = new HashMap<>();
            params.put("page", "1");
            params.put("search_type", "jd_url");
            params.put("coupon", coupon + "");
            params.put("volume", "inOrderCount30Days");
//            search_type=jd_url&keyword=%E6%89%8B%E6%9C%BA&coupon=0&volume=inOrderCount30Days&relationId=2317068823
            params.put("keyword", keywords);
            String ret = HttpClientUtil.post(souquanUrl, params);
            JingdongCouponResp jingdongCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), JingdongCouponResp.class);
            R rOk = R.ok();
            rOk.put("data", jingdongCouponResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        R rOk = R.ok();
        return rOk;
    }

    @RequestMapping("/souquan/taobao")
    @ResponseBody
    public R souquanTaobao() {
        String souquanUrl = "http://xq.meifanfan.com/api/Tb/search";
        String keywords = getStringParameter("keywords", null);
        int coupon = getIntegerParameter("coupon", 0);
        if (TextUtils.isEmpty(keywords)) {
            return R.error("搜索内容不能为空");
        }
        try {
            keywords = URLDecoder.decode(keywords, "utf-8");
            Map<String, String> params = new HashMap<>();
            params.put("page", "1");
            params.put("coupon", coupon + "");
            params.put("keyword", keywords);
            String ret = HttpClientUtil.post(souquanUrl, params);
            TaobaoCouponResp taobaoCouponResp = JSON.toJavaObject(JSONObject.parseObject(ret), TaobaoCouponResp.class);
            R rOk = R.ok();
            rOk.put("data", taobaoCouponResp.getData());
            return rOk;
        } catch (Exception e) {
            e.printStackTrace();
        }

        R rOk = R.ok();
        return rOk;
    }

    public static void main(String[] args) {
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
