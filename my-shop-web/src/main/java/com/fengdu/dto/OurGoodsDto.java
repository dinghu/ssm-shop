package com.fengdu.dto;

import com.fengdu.pojo.Goods;
import com.fengdu.pojo.ShopCategory;

import java.util.ArrayList;
import java.util.List;

public class OurGoodsDto {
    public List<Goods> products = new ArrayList<>();
    public ShopCategory category;
}
