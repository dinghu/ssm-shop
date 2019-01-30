package com.fengdu.service;

import com.fengdu.pojo.UserPojo;

public interface UserService {

    UserPojo queryByAccount(String account);

    UserPojo selectByUserName(String username);

    UserPojo selectByUserPhone(String phone);

    void save(UserPojo userPojo);
}
