package com.fengdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.UserDao;
import com.fengdu.entity.UserEntity;
import com.fengdu.service.UserService;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-16 15:02:28
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity queryObject(Integer id) {
        return userDao.queryObject(id);
    }

    @Override
    public List<UserEntity> queryList(Map<String, Object> map) {
        return userDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return userDao.queryTotal(map);
    }

    @Override
    public int save(UserEntity user) {
        user.setRegisterTime(new Date());
        return userDao.save(user);
    }

    @Override
    public int update(UserEntity user) {
        return userDao.update(user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return userDao.deleteBatch(ids);
    }
}
