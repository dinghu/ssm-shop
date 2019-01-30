package com.fengdu.service.impl;

import com.fengdu.dao.UserPojoMapper;
import com.fengdu.pojo.UserPojo;
import com.fengdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserPojoMapper userPojoMapper;

    @Override
    public void save(UserPojo userPojo) {
        userPojoMapper.save(userPojo);
    }

    @Override
    public UserPojo queryByAccount(String account) {
        return userPojoMapper.selectByAccount(account);
    }

    @Override
    public UserPojo selectByUserName(String username) {
        return userPojoMapper.selectByUserName(username);
    }

    @Override
    public UserPojo selectByUserPhone(String phone) {
        return userPojoMapper.selectByUserPhone(phone);
    }
}
