package com.fengdu.service;

import com.fengdu.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> queryList(int offset, int limit);
    List<Goods> queryListByCategory(int categoryId, int offset, int limit);
}
