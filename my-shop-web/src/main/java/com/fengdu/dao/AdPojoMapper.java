package com.fengdu.dao;

import com.fengdu.pojo.AdPojo;

import java.util.List;
import java.util.Map;

public interface AdPojoMapper {
    List<AdPojo> queryList(Map<String, Object> map);
}