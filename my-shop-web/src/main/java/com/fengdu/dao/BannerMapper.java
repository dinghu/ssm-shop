package com.fengdu.dao;

import com.fengdu.mysql.FilterRule;
import com.fengdu.mysql.PageQuery;
import com.fengdu.pojo.BannerPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BannerMapper {
    List<BannerPojo> queryList(Map<String, Object> map);
    List<BannerPojo> findByPage(@Param("filterRules") List<FilterRule> filterRules, @Param("pageQuery") PageQuery pageQuery);
}