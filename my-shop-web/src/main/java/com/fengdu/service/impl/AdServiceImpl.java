package com.fengdu.service.impl;

import com.fengdu.dao.AdPojoMapper;
import com.fengdu.pojo.AdPojo;
import com.fengdu.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    AdPojoMapper adPojoMapper;

    @Override
    public List<AdPojo> queryList(Map<String, Object> map) {
        return adPojoMapper.queryList(map);
    }
}
