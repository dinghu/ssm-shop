package com.fengdu.dao;

import com.fengdu.pojo.UserPojo;

public interface UserPojoMapper {
    UserPojo selectByAccount(String account);
    UserPojo selectByUserName(String username);
    UserPojo selectByUserPhone(String phone);
    void save(UserPojo userPojo);
}