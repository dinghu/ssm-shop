package com.fengdu.dao;

import com.fengdu.pojo.UserLevelPojo;

public interface UserLevelMapper {
    UserLevelPojo selectByPrimaryKey(Byte id);
    int updateByPrimaryKeySelective(UserLevelPojo record);
}