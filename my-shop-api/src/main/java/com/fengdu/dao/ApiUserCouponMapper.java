package com.fengdu.dao;

import com.fengdu.dao.BaseDao;
import com.fengdu.entity.UserCouponVo;

import org.apache.ibatis.annotations.Param;

/**
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-11 09:16:47
 */
public interface ApiUserCouponMapper extends BaseDao<UserCouponVo> {
    UserCouponVo queryByCouponNumber(@Param("coupon_number") String coupon_number);
}
