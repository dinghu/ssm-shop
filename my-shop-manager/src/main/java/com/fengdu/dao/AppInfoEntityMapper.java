package com.fengdu.dao;

import com.fengdu.entity.AppInfoEntity;

public interface AppInfoEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppInfoEntity record);

    int insertSelective(AppInfoEntity record);

    AppInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppInfoEntity record);

    int updateByPrimaryKey(AppInfoEntity record);
}