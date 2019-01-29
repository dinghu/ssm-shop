package com.fengdu.service;

import java.util.List;
import java.util.Map;

import com.fengdu.entity.RelatedGoodsEntity;

/**
 * 
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:09
 */
public interface RelatedGoodsService {
	
	RelatedGoodsEntity queryObject(Integer id);
	
	List<RelatedGoodsEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RelatedGoodsEntity relatedGoods);
	
	void update(RelatedGoodsEntity relatedGoods);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
