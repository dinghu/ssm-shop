package com.fengdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fengdu.dao.CategoryDao;
import com.fengdu.entity.CategoryEntity;
import com.fengdu.service.CategoryService;

import java.util.List;
import java.util.Map;

/**
 * Service实现类
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-21 15:32:31
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public CategoryEntity queryObject(Integer id) {
        return categoryDao.queryObject(id);
    }

    @Override
    public List<CategoryEntity> queryList(Map<String, Object> map) {
        return categoryDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return categoryDao.queryTotal(map);
    }

    @Override
    public int save(CategoryEntity category) {
        return categoryDao.save(category);
    }

    @Override
    public int update(CategoryEntity category) {
        return categoryDao.update(category);
    }

    @Override
    public int delete(Integer id) {
        return categoryDao.delete(id);
    }

    @Override
    @Transactional
    public int deleteBatch(Integer[]ids) {
        categoryDao.deleteByParentBatch(ids);
        return categoryDao.deleteBatch(ids);
    }
}
