package com.fengdu.dao;

import com.fengdu.pojo.AdvantagePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvantageMapper {
    List<AdvantagePojo> queryList(@Param("limit")int limit);
}