package com.fengdu.dao;

import com.fengdu.pojo.CommodityPojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityMapper {
    List<CommodityPojo> queryList(@Param("offset") int offset, @Param("limit") int limit);

    List<CommodityPojo> queryListByCategory(@Param("categoryId") int categoryId, @Param("offset") int offset, @Param("limit") int limit);
}
