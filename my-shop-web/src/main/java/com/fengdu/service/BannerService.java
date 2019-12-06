package com.fengdu.service;

import com.fengdu.pojo.BannerPojo;

import java.util.List;
import java.util.Map;

public interface BannerService {
    List<BannerPojo> queryList(Map<String, Object> map);
}
