package com.fengdu.service;

import com.fengdu.pojo.AdPojo;

import java.util.List;
import java.util.Map;

public interface AdService {
    List<AdPojo> queryList(Map<String, Object> map);
}
