package com.fengdu.api;

import com.fengdu.annotation.IgnoreAuth;
import com.fengdu.service.ApiUserService;
import com.fengdu.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api/register")
@Api(value = "注册模块接口->api", tags = { "API登录授权Controller" })
public class ApiRegisterController {
    @Autowired
    private ApiUserService userService;

    /**
     * 注册
     */
    @IgnoreAuth
    @RequestMapping("register")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public R register(String mobile, String password) {

        userService.save(mobile, password);

        return R.ok();
    }
}
