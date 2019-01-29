package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.GoodsEntity;

/**
 * Dao
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-21 21:19:49
 */
public interface GoodsDao extends BaseDao<GoodsEntity> {
    Integer queryMaxId();
}
