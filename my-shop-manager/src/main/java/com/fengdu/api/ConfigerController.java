package com.fengdu.api;

import com.fengdu.controller.BaseController;
import com.fengdu.dao.ConfigEntityMapper;
import com.fengdu.entity.AdEntity;
import com.fengdu.entity.BannerEntity;
import com.fengdu.entity.ConfigEntity;
import com.fengdu.entity.GoodsEntity;
import com.fengdu.service.AdService;
import com.fengdu.service.BannerService;
import com.fengdu.service.GoodsService;
import com.fengdu.utils.R;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/config")
public class ConfigerController extends BaseController {
    @Autowired
    GoodsService goodsService;
    @Autowired
    AdService adService;

    @Autowired
    ConfigEntityMapper configEntityMapper;

    @RequestMapping("/getIndex/mobile")
    @ResponseBody
    public R getIndex(HttpServletRequest req) {
        String keywords = getStringParameter("keywords", null);
        Map<String, Object> params = new HashMap<>();
        params.put("ad_position_id", 2);//移动端图标
        List<AdEntity> bannerEntities = adService.queryList(params);

        Map paramRecommend = new HashMap();
        paramRecommend.put("isDelete", 0);
        paramRecommend.put("offset", 0);
        paramRecommend.put("limit", 30);
        if (!TextUtils.isEmpty(keywords)) {
            try {
                keywords = URLDecoder.decode(keywords, "utf-8");
                String[] keywordsArrays = keywords.split(",");
                if (keywordsArrays.length == 1) {
                    paramRecommend.put("name", keywords);
                } else {
                    if (keywordsArrays.length >= 2) {
                        paramRecommend.put("keywords", Arrays.asList(keywordsArrays));
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        List<GoodsEntity> recommendCommodities = goodsService.queryList(paramRecommend);

        Map paramConfig = new HashMap();
        paramConfig.put("isVisible", 0);
        paramConfig.put("offset", 0);
        paramConfig.put("limit", 8);
        paramConfig.put("type", 1);
        List<ConfigEntity> configEntities = configEntityMapper.queryList(paramConfig);

        Map<String, Object> retMap = new HashMap<>();
        retMap.put("banner", bannerEntities);
        retMap.put("configIcon", configEntities);
        retMap.put("recommend", recommendCommodities);
        R rOk = R.ok();
        rOk.put("data", retMap);
        return rOk;
    }
}
