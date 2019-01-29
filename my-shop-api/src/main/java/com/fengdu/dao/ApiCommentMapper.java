package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.CommentVo;

import java.util.Map;

/**
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-11 09:14:26
 */
public interface ApiCommentMapper extends BaseDao<CommentVo> {
    int queryhasPicTotal(Map<String, Object> map);
}
