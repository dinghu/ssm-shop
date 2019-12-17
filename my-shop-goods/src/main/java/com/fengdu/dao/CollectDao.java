package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.CollectEntity;
import com.fengdu.entity.GoodsCollectEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:06
 */
public interface CollectDao extends BaseDao<CollectEntity> {
    List<GoodsCollectEntity> queryListbyUid(Map<String, Object> map);
    CollectEntity queryObjectbyUidAndVid(Map<String, Object> map);
    void deletebyUidAndVid(Map<String, Object> map);
}
