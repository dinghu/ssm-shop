package com.fengdu.api;

import com.alibaba.fastjson.JSONObject;
import com.fengdu.annotation.LoginUser;
import com.fengdu.entity.FeedbackVo;
import com.fengdu.entity.UserVo;
import com.fengdu.service.ApiFeedbackService;
import com.fengdu.util.ApiBaseAction;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * 作者: @author Harmon <br>
 * 时间: 2017-08-11 08:32<br>
 * 描述: ApiFeedbackController <br>
 */
@RestController
@RequestMapping("/api/feedback")
@Api(value = "反馈模块接口->api", tags = { "反馈接口Controller" })
public class ApiFeedbackController extends ApiBaseAction {
    @Autowired
    private ApiFeedbackService feedbackService;

    /**
     * 添加反馈
     */
    @RequestMapping("save")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public Object save(@LoginUser UserVo loginUser) {
        JSONObject feedbackJson = super.getJsonRequest();
        if (null != feedbackJson) {
            FeedbackVo feedbackVo = new FeedbackVo();
            feedbackVo.setUserId(loginUser.getUserId().intValue());
            feedbackVo.setUserName(loginUser.getUsername());
            feedbackVo.setMobile(feedbackJson.getString("mobile"));
            feedbackVo.setFeedType(feedbackJson.getInteger("index"));
            feedbackVo.setStatus(1);
            feedbackVo.setContent(feedbackJson.getString("content"));
            feedbackVo.setAddTime(new Date());
            feedbackService.save(feedbackVo);
            return super.toResponsSuccess("感谢你的反馈");
        }
        return super.toResponsFail("反馈失败");
    }
}