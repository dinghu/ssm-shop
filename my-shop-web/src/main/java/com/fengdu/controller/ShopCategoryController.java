package com.fengdu.controller;

//import com.fengdu.pojo.ShopCategory;
import com.fengdu.service.ShopCategoryService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/shopCategory")
public class ShopCategoryController {
    @Autowired
    ShopCategoryService shopCategoryService;

    @RequestMapping(value = "/getPopularCategory", method = RequestMethod.GET)
    @ResponseBody
    public R getPopularCategory() {
        List<ShopCategory> shopCategoryList = shopCategoryService.getPopularCategory();
        R r = R.ok();
        r.put("popularCategory", shopCategoryList);
        return r;
    }
}
