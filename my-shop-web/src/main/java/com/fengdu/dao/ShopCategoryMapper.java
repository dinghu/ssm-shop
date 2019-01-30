package com.fengdu.dao;

import com.fengdu.pojo.ShopCategory;

import java.util.List;

public interface ShopCategoryMapper {
    List<ShopCategory> getPopularCategory();
}