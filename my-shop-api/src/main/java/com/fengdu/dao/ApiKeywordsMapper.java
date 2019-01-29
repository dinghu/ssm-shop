package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.KeywordsVo;

import java.util.List;
import java.util.Map;

/**
 * 热闹关键词表
 * 
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-11 09:16:46
 */
public interface ApiKeywordsMapper extends BaseDao<KeywordsVo> {
    List<Map> hotKeywordList(Map param);
}
