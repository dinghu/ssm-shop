package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}
