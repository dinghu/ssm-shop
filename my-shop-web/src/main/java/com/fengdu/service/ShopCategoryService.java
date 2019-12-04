package com.fengdu.service;

import com.fengdu.pojo.ShopCategoryPojo;
import io.swagger.models.auth.In;

import java.util.List;

public interface ShopCategoryService {
    List<ShopCategoryPojo> getPopularCategory();
    List<ShopCategoryPojo> getRecommendCategory();
    List<ShopCategoryPojo> queryList(Integer offset, Integer limit);
}
