package com.fengdu.service.impl;

import com.fengdu.dao.AdDao;
import com.fengdu.dao.BannerDao;
import com.fengdu.entity.BannerEntity;
import com.fengdu.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<BannerEntity> queryList(Map<String, Object> map) {
        return bannerDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return bannerDao.queryTotal(map);
    }
}
