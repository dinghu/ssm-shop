package com.fengdu.dao;

import com.fengdu.pojo.Advantage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvantageMapper {
    List<Advantage> queryList(@Param("limit")int limit);
}