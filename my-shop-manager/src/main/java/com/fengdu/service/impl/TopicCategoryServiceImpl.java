package com.fengdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.TopicCategoryDao;
import com.fengdu.entity.TopicCategoryEntity;
import com.fengdu.service.TopicCategoryService;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-20 15:41:56
 */
@Service("topicCategoryService")
public class TopicCategoryServiceImpl implements TopicCategoryService {
    @Autowired
    private TopicCategoryDao topicCategoryDao;

    @Override
    public TopicCategoryEntity queryObject(Integer id) {
        return topicCategoryDao.queryObject(id);
    }

    @Override
    public List<TopicCategoryEntity> queryList(Map<String, Object> map) {
        return topicCategoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return topicCategoryDao.queryTotal(map);
    }

    @Override
    public int save(TopicCategoryEntity topicCategory) {
        return topicCategoryDao.save(topicCategory);
    }

    @Override
    public int update(TopicCategoryEntity topicCategory) {
        return topicCategoryDao.update(topicCategory);
    }

    @Override
    public int delete(Integer id) {
        return topicCategoryDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return topicCategoryDao.deleteBatch(ids);
    }
}
