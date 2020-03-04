package com.fengdu.api;

import com.fengdu.controller.BaseController;
import com.fengdu.dao.AppInfoEntityMapper;
import com.fengdu.dao.ConfigEntityMapper;
import com.fengdu.entity.AdEntity;
import com.fengdu.entity.AppInfoEntity;
import com.fengdu.entity.ConfigEntity;
import com.fengdu.entity.GoodsEntity;
import com.fengdu.service.AdService;
import com.fengdu.service.GoodsService;
import com.fengdu.utils.R;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    AppInfoEntityMapper appInfoDao;

    @Autowired
    ConfigEntityMapper configEntityMapper;

    @RequestMapping(value = "/popoWin/redbag")
    @ResponseBody
    public R popoWin(HttpServletRequest request) {
        Map<String, Object> params = new HashMap<>();
        params.put("ad_position_id", 3);//红包弹框广告位
        params.put("enabled", 1);//红包弹框广告位
        List<AdEntity> adEntities = adService.queryList(params);
        R rOk = R.ok();
        rOk.put("data", adEntities);
        return rOk;
    }

    @RequestMapping(value = "/check_update")
    @ResponseBody
    public R check_update(HttpServletRequest request, HttpServletResponse response) {
        String version = request.getParameter("version");
        R result = R.ok();
        AppInfoEntity appInfoEntity = appInfoDao.selectByPrimaryKey(1);
        if (appInfoEntity != null) {
            String versionServe = appInfoEntity.getVersion();
            String newfunc = appInfoEntity.getContent();
            boolean forceUpdate = appInfoEntity.getForceUpdate() != 0;
            String apkUrl = appInfoEntity.getDownloadUrl();
            if (versionServe.compareTo(version) > 0) {
                Map param = new HashMap();
                param.put("new", apkUrl);
                param.put("forceUpdate", forceUpdate);
                param.put("newfunc", newfunc);
                result.put("data", param);
            }
        }
        return result;
    }

    @RequestMapping("/getIndex/mobile")
    @ResponseBody
    public R getIndex(HttpServletRequest req) {
        String keywords = getStringParameter("keywords", null);
        Map<String, Object> params = new HashMap<>();
        params.put("ad_position_id", 2);//移动端图标
        params.put("enabled", 1);//移动端图标
        List<AdEntity> bannerEntities = adService.queryList(params);

        Map paramRecommend = new HashMap();
        paramRecommend.put("isDelete", 0);
        paramRecommend.put("offset", 0);
        paramRecommend.put("limit", 40);
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
        if (recommendCommodities == null || recommendCommodities.isEmpty()) {
            if (!TextUtils.isEmpty(keywords)) {
                Map paramRecommend1 = new HashMap();
                paramRecommend1.put("isDelete", 0);
                paramRecommend1.put("offset", 0);
                paramRecommend1.put("limit", 40);
                recommendCommodities = goodsService.queryList(paramRecommend1);
            }
        }

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
