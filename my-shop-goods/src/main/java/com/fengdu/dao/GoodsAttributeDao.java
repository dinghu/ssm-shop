package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.GoodsAttributeEntity;

/**
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:08
 */
public interface GoodsAttributeDao extends BaseDao<GoodsAttributeEntity> {

    int updateByGoodsIdAttributeId(GoodsAttributeEntity goodsAttributeEntity);
}
