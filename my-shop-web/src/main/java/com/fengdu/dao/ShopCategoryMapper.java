package com.fengdu.dao;

import com.fengdu.pojo.ShopCategoryPojo;

import java.util.List;

public interface ShopCategoryMapper {
    List<ShopCategoryPojo> getPopularCategory();
    List<ShopCategoryPojo> getRecommendCategory();
    List<ShopCategoryPojo> queryList(Integer offset, Integer limit);
}