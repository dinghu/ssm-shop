package com.fengdu.controller;

import com.fengdu.dao.GoodsMapper;
import com.fengdu.pojo.Goods;
import com.fengdu.service.GoodsService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/getGoods")
    @ResponseBody
    public R queryList(int categoryId, int offset, int limit) {
        List<Goods> goodsList = goodsService.queryList(offset, limit);
        R r = R.ok();
        r.put("goods", goodsList);
        return r;
    }

}
