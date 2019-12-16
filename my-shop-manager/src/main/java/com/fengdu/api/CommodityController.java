package com.fengdu.api;

import com.fengdu.controller.BaseController;
import com.fengdu.entity.GoodsEntity;
import com.fengdu.service.GoodsService;
import com.fengdu.utils.R;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/commodity")
public class CommodityController extends BaseController {

    @Autowired
    GoodsService goodsService;


    @RequestMapping("/getCommodities")
    @ResponseBody
    public R getCommodities(HttpServletRequest req) {
        Integer categoryId = getIntegerParameter("categoryId", 0);
        Integer pageNo = getIntegerParameter("pageNo", 1);
        Integer pageSize = getIntegerParameter("pageSize", 10);
        String keywords = getStringParameter("keywords", null);
        Integer isNine = getIntegerParameter("isNine", 0);
        String sort = getStringParameter("sort", null);
        int limit = pageSize.intValue();
        int offset = (pageNo - 1) * limit;
        Map param = new HashMap();
        param.put("isDelete", 0);
        if (categoryId != 0) {
            param.put("categoryId", categoryId);
        }
        param.put("offset", offset);
        param.put("limit", limit);
        if (isNine == 1) {
            param.put("isNine", 1);
        }
        if (!TextUtils.isEmpty(sort)) {
            if ("price".equals(sort)) {
                param.put("sidx", "retail_price");
                param.put("order", "asc");
            } else if ("discount".equals(sort)) {
                param.put("sidx", "coupon_price");
                param.put("order", "desc");
            }
        }
        if (!TextUtils.isEmpty(keywords)) {
            try {
                keywords = URLDecoder.decode(keywords, "utf-8");
                String[] keywordsArrays = keywords.split(",");
                if (keywordsArrays.length >= 1) {
                    param.put("name", keywords);
                }
                if (keywordsArrays.length >= 2) {
                    param.put("keywords", Arrays.asList(keywordsArrays));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        List<GoodsEntity> commodities = goodsService.queryList(param);
        R r = R.ok();
        r.put("data", commodities);
        return r;
    }

}
