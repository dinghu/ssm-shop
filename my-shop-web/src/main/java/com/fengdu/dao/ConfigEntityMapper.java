package com.fengdu.dao;

import com.fengdu.pojo.ConfigEntity;

public interface ConfigEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigEntity record);

    int insertSelective(ConfigEntity record);

    ConfigEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigEntity record);

    int updateByPrimaryKey(ConfigEntity record);
}