package com.fengdu.service;

import com.fengdu.pojo.Advise;

import java.util.List;

public interface AdviseService  {
    List<Advise> queryList(int limit);
}
