package com.fengdu.dao;

import com.fengdu.pojo.AdvisePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdviseMapper {
    List<AdvisePojo> queryList(@Param("limit")int limit);
}