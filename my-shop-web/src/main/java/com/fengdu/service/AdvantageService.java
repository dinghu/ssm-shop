package com.fengdu.service;

import com.fengdu.pojo.AdvantagePojo;

import java.util.List;

public interface AdvantageService {
    List<AdvantagePojo> queryList(int limit);
}
