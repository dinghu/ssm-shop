package com.fengdu.service.impl;

import com.fengdu.dao.AdviseMapper;
import com.fengdu.pojo.AdvisePojo;
import com.fengdu.service.AdviseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdviseServiceImpl implements AdviseService {

    @Autowired
    AdviseMapper adviseMapper;

    @Override
    public List<AdvisePojo> queryList(int limit) {
        return adviseMapper.queryList(limit);
    }
}
