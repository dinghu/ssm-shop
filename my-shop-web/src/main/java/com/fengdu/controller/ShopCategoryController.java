package com.fengdu.controller;

import com.fengdu.pojo.ShopCategory;
import com.fengdu.service.ShopCategoryService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/shopCategory")
public class ShopCategoryController {
    @Autowired
    ShopCategoryService shopCategoryService;

    public R getPopularCategory() {
        return R.ok();
    }
}
