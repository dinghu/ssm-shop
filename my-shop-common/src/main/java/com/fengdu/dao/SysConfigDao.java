package com.fengdu.dao;

import org.apache.ibatis.annotations.Param;

import com.fengdu.entity.SysConfigEntity;

/**
 * 系统配置信息
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2016年12月4日 下午6:46:16
 */
public interface SysConfigDao extends BaseDao<SysConfigEntity> {

    /**
     * 根据key，查询value
     */
    String queryByKey(String paramKey);

    /**
     * 根据key，更新value
     */
    int updateValueByKey(@Param("key") String key, @Param("value") String value);

}
