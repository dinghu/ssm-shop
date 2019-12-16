package com.fengdu.api;

import com.fengdu.controller.TopicController;
import com.fengdu.entity.TopicEntity;
import com.fengdu.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/topic")
public class ApiTopicController extends TopicController {

    /**
     * 保存
     */
    @RequestMapping("/topicList")
    public R colletlist(HttpServletRequest req) {
        Integer topicCategoryId = getIntegerParameter("topicCategoryId", -1);
        Integer pageNo = getIntegerParameter("pageNo", 1);
        Integer pageSize = getIntegerParameter("pageSize", 10);
        int limit = pageSize.intValue();
        int offset = (pageNo - 1) * limit;
        Map param = new HashMap();
        param.put("offset", offset);
        param.put("limit", limit);
        if (-1 != topicCategoryId) {
            param.put("topicCategoryId", topicCategoryId);
        }
        List<TopicEntity> topicEntities = topicService.queryList(param);
        R r = R.ok();
        r.put("data", topicEntities);
        return r;
    }
}
