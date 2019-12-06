package com.fengdu.service.impl;

import com.fengdu.dao.BannerMapper;
import com.fengdu.pojo.BannerPojo;
import com.fengdu.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper adPojoMapper;

    @Override
    public List<BannerPojo> queryList(Map<String, Object> map) {
        return adPojoMapper.queryList(map);
    }
}
