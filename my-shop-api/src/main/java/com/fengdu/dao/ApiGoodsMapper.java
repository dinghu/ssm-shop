package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.GoodsVo;

import java.util.List;
import java.util.Map;

/**
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-11 09:16:45
 */
public interface ApiGoodsMapper extends BaseDao<GoodsVo> {

    List<GoodsVo> queryHotGoodsList(Map<String, Object> params);

    List<GoodsVo> queryCatalogProductList(Map<String, Object> params);
}
