package com.fengdu.api;

import com.fengdu.controller.ChannelController;
import com.fengdu.entity.ChannelEntity;
import com.fengdu.utils.Query;
import com.fengdu.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/api/channel")
public class ApiChannelController extends ChannelController {
    /**
     * 保存
     */
    @RequestMapping("/channelList")
    public R colletlist(HttpServletRequest req) {
        //查询列表数据
        Query query = new Query(new HashMap<String, Object>());
        List<ChannelEntity> collectEntities = channelService.queryList(query);
        R r = R.ok();
        r.put("data", collectEntities);
        return r;
    }
}
