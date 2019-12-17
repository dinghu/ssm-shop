package com.fengdu.service;

import java.util.List;
import java.util.Map;

import com.fengdu.entity.CollectEntity;
import com.fengdu.entity.GoodsCollectEntity;

/**
 * 
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:06
 */
public interface CollectService {
	
	CollectEntity queryObject(Integer id);
	
	List<CollectEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CollectEntity collect);
	
	void update(CollectEntity collect);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);

	List<GoodsCollectEntity> queryListbyUid(Map<String, Object> map);

	CollectEntity queryObjectbyUidAndVid(Map<String, Object> map);

	void deletebyUidAndVid(Map<String, Object> map);
}
