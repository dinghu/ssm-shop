package com.fengdu.service.impl;

import com.fengdu.dao.CommodityMapper;
import com.fengdu.pojo.CommodityPojo;
import com.fengdu.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityMapper goodsMapper;

    @Override
    public List<CommodityPojo> queryList(int offset, int limit) {
        return goodsMapper.queryList(offset, limit);
    }

    @Override
    public List<CommodityPojo> queryListByCategory(int categoryId, int offset, int limit) {
        return goodsMapper.queryListByCategory(categoryId, offset, limit);
    }
}
