package com.fengdu.api;

import com.alibaba.fastjson.JSONObject;
import com.fengdu.annotation.SysLog;
import com.fengdu.dto.UserDto;
import com.fengdu.entity.UserEntity;
import com.fengdu.service.UserService;
import com.fengdu.utils.R;
import com.fengdu.utils.RedisUtils;
import com.fengdu.utils.ShiroUtils;
import com.fengdu.utils.TokenUtils;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.http.util.TextUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/user")
public class ApiUserController {
    @Autowired
    private Producer producer;
    @Autowired
    UserService userService;
    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("captcha.jpg")
    public void captcha(HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }

    @ResponseBody
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public R regist(String username, String phone, String password) {//, String captcha
        if (TextUtils.isEmpty(username)) {
            return R.error("用户账号不能为空");
        }
        if (TextUtils.isEmpty(phone)) {
            return R.error("手机号码不能为空");
        }
        if (TextUtils.isEmpty(password)) {
            return R.error("用户密码不能为空");
        }
        UserEntity userEntity = userService.queryByUserName(username);
        if (userEntity != null) {
            return R.error("用户名已存在");
        }
        userEntity = userService.queryByByPhone(phone);
        if (userEntity != null) {
            return R.error("手机已注册，请直接登录");
        }
        userEntity = new UserEntity();
        userEntity.setMobile(phone);
        userEntity.setUsername(username);
        String passwordHash256 = new Sha256Hash(password).toHex();
        userEntity.setPassword(passwordHash256);
        userEntity.setRegisterTime(new Date());
        userService.save(userEntity);
        return R.ok();
    }

    /**
     * 登录
     */
    @SysLog("登录")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R login(String username, String password) {//, String captcha
        R result = R.ok();
        if (TextUtils.isEmpty(username)) {
            return R.error("用户账号不能为空");
        }
        if (TextUtils.isEmpty(password)) {
            return R.error("用户密码不能为空");
        }
        UserEntity userEntity = userService.queryByAccount(username);
        if (userEntity != null) {
            try {
                //比较一下密码
                String passwordHash256 = new Sha256Hash(password).toHex();
                if (!passwordHash256.equals(userEntity.getPassword())) {
                    return R.error("密码不正确");
                }
                UserDto userDto = new UserDto();
                BeanUtils.copyProperties(userEntity, userDto);
                String token = TokenUtils.createJWT(TokenUtils.JWT_ID, TokenUtils.JWT_TTL,
                        JSONObject.parseObject(JSONObject.toJSONString(userDto)));
                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("token", token);
                resultMap.put("userInfo", userDto);
                result.put("data", resultMap);
            } catch (Exception e) {
                return R.error("服务器内部错误");
            }
        } else {
            return R.error("未查询到账号相关信息,请注册");
        }

        return result;
    }

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /**
     * 退出
     */
    @RequestMapping(value = "/logout")
    public String logout() {
        ShiroUtils.logout();
        return "redirect:user/toLogin";
    }
}
