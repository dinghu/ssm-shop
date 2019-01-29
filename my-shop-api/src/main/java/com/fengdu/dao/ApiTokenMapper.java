package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.TokenEntity;

import org.apache.ibatis.annotations.Param;

/**
 * 用户Token
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-03-23 15:22:07
 */
public interface ApiTokenMapper extends BaseDao<TokenEntity> {

    TokenEntity queryByUserId(@Param("userId") Long userId);

    TokenEntity queryByToken(@Param("token") String token);

}
