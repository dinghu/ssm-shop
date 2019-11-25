package com.fengdu.service;

import com.fengdu.pojo.CommodityPojo;

import java.util.List;

public interface CommodityService {
    List<CommodityPojo> queryList(int offset, int limit);
    List<CommodityPojo> queryListByCategory(int categoryId, int offset, int limit);
}
