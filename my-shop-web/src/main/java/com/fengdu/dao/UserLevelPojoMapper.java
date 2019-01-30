package com.fengdu.dao;

import com.fengdu.pojo.UserLevelPojo;

public interface UserLevelPojoMapper {
    UserLevelPojo selectByPrimaryKey(Byte id);
    int updateByPrimaryKeySelective(UserLevelPojo record);
}