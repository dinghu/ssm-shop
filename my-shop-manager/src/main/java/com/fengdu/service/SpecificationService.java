package com.fengdu.service;

import java.util.List;
import java.util.Map;

import com.fengdu.entity.SpecificationEntity;

/**
 * 规格表
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-13 10:41:10
 */
public interface SpecificationService {
	
	SpecificationEntity queryObject(Integer id);
	
	List<SpecificationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SpecificationEntity specification);
	
	void update(SpecificationEntity specification);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
