package com.fengdu.dto;

import com.fengdu.pojo.CommodityPojo;
import com.fengdu.pojo.ShopCategoryPojo;

import java.util.ArrayList;
import java.util.List;

public class OurGoodsDto {
    public List<CommodityPojo> products = new ArrayList<>();
    public ShopCategoryPojo category;
}
