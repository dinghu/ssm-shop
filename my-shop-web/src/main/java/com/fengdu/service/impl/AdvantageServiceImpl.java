package com.fengdu.service.impl;

import com.fengdu.dao.AdvantageMapper;
import com.fengdu.pojo.AdvantagePojo;
import com.fengdu.service.AdvantageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvantageServiceImpl implements AdvantageService {

    @Autowired
    AdvantageMapper advantageMapper;

    @Override
    public List<AdvantagePojo> queryList(int limit) {
        return advantageMapper.queryList(limit);
    }
}
