package com.fengdu.dao;

import com.fengdu.entity.ConfigEntity;

public interface ConfigEntityMapper extends BaseDao<ConfigEntity>{
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigEntity record);

    int insertSelective(ConfigEntity record);

    ConfigEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigEntity record);

    int updateByPrimaryKey(ConfigEntity record);
}