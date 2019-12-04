package com.fengdu.api;

import com.fengdu.pojo.ShopCategoryPojo;
import com.fengdu.service.ShopCategoryService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/shop")
public class ShopController {
    @Autowired
    ShopCategoryService shopCategoryService;

    @RequestMapping("/getCategories")
    @ResponseBody
    public R getCategories() {
        List<ShopCategoryPojo> categoryPojoList = shopCategoryService.queryList(null, null);
        R r = R.ok();
        r.put("data", categoryPojoList);
        return r;
    }

    @RequestMapping(value = "/getPopularCategories", method = RequestMethod.GET)
    @ResponseBody
    public R getPopularCategory() {
        List<ShopCategoryPojo> shopCategoryList = shopCategoryService.getPopularCategory();
        R r = R.ok();
        r.put("data", shopCategoryList);
        return r;
    }
}
