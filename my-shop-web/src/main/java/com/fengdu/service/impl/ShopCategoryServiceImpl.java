package com.fengdu.service.impl;

import com.fengdu.dao.ShopCategoryMapper;
import com.fengdu.pojo.ShopCategoryPojo;
import com.fengdu.service.ShopCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Autowired
    ShopCategoryMapper shopCategoryMapper;

    @Override
    public List<ShopCategoryPojo> getPopularCategory() {
        return shopCategoryMapper.getPopularCategory();
    }

    @Override
    public List<ShopCategoryPojo> getRecommendCategory() {
        return shopCategoryMapper.getRecommendCategory();
    }

    @Override
    public List<ShopCategoryPojo> queryList(Integer offset, Integer limit) {
        return shopCategoryMapper.queryList(offset, limit);
    }
}
