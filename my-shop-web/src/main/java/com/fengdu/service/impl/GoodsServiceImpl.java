package com.fengdu.service.impl;

import com.fengdu.dao.GoodsMapper;
import com.fengdu.pojo.Goods;
import com.fengdu.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> queryList(int offset, int limit) {
        return goodsMapper.queryList(offset, limit);
    }

    @Override
    public List<Goods> queryListByCategory(int categoryId, int offset, int limit) {
        return goodsMapper.queryListByCategory(categoryId, offset, limit);
    }
}
