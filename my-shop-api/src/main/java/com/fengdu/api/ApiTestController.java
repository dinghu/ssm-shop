package com.fengdu.api;

import com.fengdu.annotation.IgnoreAuth;
import com.fengdu.annotation.LoginUser;
import com.fengdu.entity.UserVo;
import com.fengdu.service.ApiUserService;
import com.fengdu.util.ApiBaseAction;
import com.fengdu.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API测试接口
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-03-23 15:47
 */
@RestController
@RequestMapping("/api/test")
@Api(value = "测试接口模块接口->api", tags = { "API测试接口Controller" })
public class ApiTestController extends ApiBaseAction{

    @Autowired
    private ApiUserService userService;
    
    
    /**
     * app首页
     */
    @IgnoreAuth
    @RequestMapping("hello")
    @ApiOperation(value = "api 测试接口",response=Map.class, notes ="返回结果就是正常")
    public Object test() {
      
        return toResponsSuccess("greed is good");
    }
    
    

    /**
     * 获取用户信息
     */
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserVo user) {
        return R.ok().put("user", user);
    }

    /**
     * 忽略Token验证测试
     */
    @IgnoreAuth
    @GetMapping("notToken")
    public R notToken() {
        return R.ok().put("msg", "无需token也能访问。。。");
    }

    /**
     * 根据手机号查询用户信息接口测试方法
     *
     * @param mobile
     * @return
     */
    @IgnoreAuth
    @GetMapping("userListByMobile")
    public R userList(String mobile) {
        UserVo userEntity = userService.queryByMobile(mobile);
        return R.ok().put("dto", userEntity);
    }
}
