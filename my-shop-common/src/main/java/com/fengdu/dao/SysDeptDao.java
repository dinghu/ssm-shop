package com.fengdu.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fengdu.entity.SysDeptEntity;
import com.fengdu.entity.UserWindowDto;

import java.util.List;

/**
 * 部门管理
 *
 * @author liepngjun
 * @email 2366207000@qq.com
 * @date 2017-09-17 23:58:47
 */
@Mapper
public interface SysDeptDao extends BaseDao<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     *
     * @param parentId 上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);


    /**
     * 根据实体条件查询
     * @return
     */
    List<UserWindowDto> queryPageByDto(UserWindowDto userWindowDto);
}
