package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.GoodsGalleryEntity;

import java.util.Map;

/**
 * Dao
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-23 14:41:43
 */
public interface GoodsGalleryDao extends BaseDao<GoodsGalleryEntity> {
    int deleteByGoodsId(Map<String, Integer> map);
}
