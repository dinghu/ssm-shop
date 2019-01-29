package com.fengdu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdu.dao.CouponGoodsDao;
import com.fengdu.entity.CouponGoodsEntity;
import com.fengdu.service.CouponGoodsService;

import java.util.List;
import java.util.Map;

/**
 * 优惠券关联商品Service实现类
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-08-29 21:50:17
 */
@Service("couponGoodsService")
public class CouponGoodsServiceImpl implements CouponGoodsService {
    @Autowired
    private CouponGoodsDao couponGoodsDao;

    @Override
    public CouponGoodsEntity queryObject(Integer id) {
        return couponGoodsDao.queryObject(id);
    }

    @Override
    public List<CouponGoodsEntity> queryList(Map<String, Object> map) {
        return couponGoodsDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return couponGoodsDao.queryTotal(map);
    }

    @Override
    public int save(CouponGoodsEntity couponGoods) {
        return couponGoodsDao.save(couponGoods);
    }

    @Override
    public int update(CouponGoodsEntity couponGoods) {
        return couponGoodsDao.update(couponGoods);
    }

    @Override
    public int delete(Integer id) {
        return couponGoodsDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[]ids) {
        return couponGoodsDao.deleteBatch(ids);
    }
}
