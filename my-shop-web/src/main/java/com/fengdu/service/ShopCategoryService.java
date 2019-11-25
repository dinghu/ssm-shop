package com.fengdu.service;

import com.fengdu.pojo.ShopCategoryPojo;

import java.util.List;

public interface ShopCategoryService {
    List<ShopCategoryPojo> getPopularCategory();
    List<ShopCategoryPojo> getRecommendCategory();
}
