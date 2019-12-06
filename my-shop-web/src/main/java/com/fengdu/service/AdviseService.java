package com.fengdu.service;

import com.fengdu.pojo.AdvisePojo;

import java.util.List;

public interface AdviseService  {
    List<AdvisePojo> queryList(int limit);
}
