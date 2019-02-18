package com.fengdu.dao;

import com.fengdu.mysql.FilterRule;
import com.fengdu.mysql.PageQuery;
import com.fengdu.pojo.AdPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AdPojoMapper {
    List<AdPojo> queryList(Map<String, Object> map);
    List<AdPojo> findByPage(@Param("filterRules") List<FilterRule> filterRules, @Param("pageQuery") PageQuery pageQuery);
}