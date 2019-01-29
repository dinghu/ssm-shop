package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.CommentPictureEntity;

/**
 * 评价图片Dao
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-29 14:45:55
 */
public interface CommentPictureDao extends BaseDao<CommentPictureEntity> {
    /**
     * 根据commentId删除
     *
     * @param commentId
     * @return
     */
    int deleteByCommentId(Integer commentId);
}
