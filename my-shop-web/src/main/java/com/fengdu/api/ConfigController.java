package com.fengdu.api;

import com.fengdu.pojo.BannerPojo;
import com.fengdu.service.BannerService;
import com.fengdu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/config")
public class ConfigController {

    @Autowired
    BannerService adService;

    @RequestMapping("/index")
    @ResponseBody
    public R getIndex() {
        Map<String, Object> params = new HashMap<>();
        params.put("ad_position_id", 2);
        List<BannerPojo> bannerPojos = adService.queryList(params);
        R rOk = R.ok();
        return rOk;
    }
}
