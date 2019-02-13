package com.fengdu.dao;

import com.fengdu.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {
    List<Goods> queryList(@Param("offset")int offset, @Param("limit")int limit);
    List<Goods> queryListByCategory(@Param("categoryId")int categoryId, @Param("offset")int offset, @Param("limit")int limit);
}
