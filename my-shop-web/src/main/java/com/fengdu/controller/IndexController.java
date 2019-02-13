package com.fengdu.controller;

import com.fengdu.dao.AdvantageMapper;
import com.fengdu.dto.OurGoodsDto;
import com.fengdu.pojo.Advantage;
import com.fengdu.pojo.Advise;
import com.fengdu.pojo.Goods;
import com.fengdu.pojo.ShopCategory;
import com.fengdu.service.AdvantageService;
import com.fengdu.service.AdviseService;
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
    @Autowired
    AdvantageService advantageService;
    @Autowired
    AdviseService adviseService;

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

    @RequestMapping("/getAll")
    @ResponseBody
    public R getAll() {
        //我们的产品
        ArrayList<OurGoodsDto> ourGoodsDtos = new ArrayList<>();
        List<ShopCategory> shopCategoryList = shopCategoryService.getRecommendCategory();
        for (ShopCategory shopCategory : shopCategoryList) {
            OurGoodsDto ourGoodsDto = new OurGoodsDto();
            ourGoodsDto.category = shopCategory;
            List<Goods> goodsList = goodsService.queryListByCategory(shopCategory.getId(), 0, 4);
            ourGoodsDto.products = goodsList;
            ourGoodsDtos.add(ourGoodsDto);
        }
        //Why Choose Us
        List<Advantage> advantageList = advantageService.queryList(3);
        List<Advise> adviseList = adviseService.queryList(3);
        List<Goods> bestSellers = goodsService.queryList(0, 3);
        R r = R.ok();
        r.put("ourProducts", ourGoodsDtos);
        r.put("advantages", advantageList);
        r.put("adviseList", adviseList);
        r.put("bestSellers", bestSellers);
        return r;
    }
}
