package com.fengdu.controller;

import com.fengdu.entity.BannerEntity;
import com.fengdu.service.BannerService;
import com.fengdu.utils.PageUtils;
import com.fengdu.utils.Query;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("banner")
public class BannerController {
    @Autowired
    BannerService bannerService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("banner:list")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<BannerEntity> bannerList = bannerService.queryList(query);
        int total = bannerService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(bannerList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }
}
