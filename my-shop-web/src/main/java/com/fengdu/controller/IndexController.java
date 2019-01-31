package com.fengdu.controller;

import com.fengdu.dto.OurGoodsDto;
import com.fengdu.pojo.Goods;
import com.fengdu.pojo.ShopCategory;
import com.fengdu.service.GoodsService;
import com.fengdu.service.ShopCategoryService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/shouye")
public class IndexController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    ShopCategoryService shopCategoryService;

    @RequestMapping("/getOurProducts")
    @ResponseBody
    public R getOurGoods() {
        ArrayList<OurGoodsDto> ourGoodsDtos = new ArrayList<>();
        List<ShopCategory> shopCategoryList = shopCategoryService.getRecommendCategory();
        for (ShopCategory shopCategory : shopCategoryList) {
            OurGoodsDto ourGoodsDto = new OurGoodsDto();
            ourGoodsDto.category = shopCategory;
            List<Goods> goodsList = goodsService.queryListByCategory(shopCategory.getId(), 0, 4);
            ourGoodsDto.products = goodsList;
            ourGoodsDtos.add(ourGoodsDto);
        }
        R r = R.ok();
        r.put("ourProducts", ourGoodsDtos);
        return r;
    }
}
