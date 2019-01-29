package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.CategoryEntity;

/**
 * Dao
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-21 15:32:31
 */
public interface CategoryDao extends BaseDao<CategoryEntity> {

    public int deleteByParentBatch(Object[] id);
}
