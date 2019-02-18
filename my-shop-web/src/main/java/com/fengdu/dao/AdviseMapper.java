package com.fengdu.dao;

import com.fengdu.pojo.Advise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdviseMapper {
    List<Advise> queryList(@Param("limit")int limit);
}