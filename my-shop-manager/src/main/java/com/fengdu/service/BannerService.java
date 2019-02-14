package com.fengdu.service;

import com.fengdu.entity.BannerEntity;

import java.util.List;
import java.util.Map;

public interface BannerService {
    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<BannerEntity> queryList(Map<String, Object> map);

    /**
     * 分页统计总数
     *
     * @param map 参数
     * @return 总数
     */
    int queryTotal(Map<String, Object> map);
}
