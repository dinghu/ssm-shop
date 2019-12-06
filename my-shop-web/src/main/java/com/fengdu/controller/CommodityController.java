package com.fengdu.controller;

import com.fengdu.controller.BaseController;
import com.fengdu.entity.GoodsEntity;
import com.fengdu.pojo.CommodityPojo;
import com.fengdu.pojo.ShopCategoryPojo;
import com.fengdu.service.CommodityService;
import com.fengdu.service.GoodsService;
import com.fengdu.service.ShopCategoryService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
        int offset = 0;
        int limit = offset + pageNo * 30;
        Map param = new HashMap();
        param.put("isDelete", 0);
        if (categoryId != 0) {
            param.put("categoryId", categoryId);
        }
        param.put("offset", offset);
        param.put("limit", limit);

        List<GoodsEntity> commodities = goodsService.queryList(param);
        R r = R.ok();
        r.put("data", commodities);
        return r;
    }

}
