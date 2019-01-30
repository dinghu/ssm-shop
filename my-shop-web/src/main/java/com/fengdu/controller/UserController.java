package com.fengdu.controller;

import com.fengdu.Global;
import com.fengdu.annotation.SysLog;
import com.fengdu.constant.MyshopConstants;
import com.fengdu.dto.UserDto;
import com.fengdu.pojo.UserPojo;
import com.fengdu.service.UserService;
import com.fengdu.utils.R;
import com.fengdu.utils.RedisUtils;
import com.fengdu.utils.ShiroUtils;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
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
import java.util.Properties;

@Controller
@RequestMapping("/user")
public class UserController {
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

    /**
     * 登录
     */
    @SysLog("登录")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R login(String username, String password, String captcha) {
        /*
        String kaptcha = ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
        if(null == kaptcha){
            return R.error("验证码已失效");
        }
        if (!captcha.equalsIgnoreCase(kaptcha)) {
            return R.error("验证码不正确");
        }
        */
        try {
            Subject subject = ShiroUtils.getSubject();
            //sha256加密
            password = new Sha256Hash(password).toHex();
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            subject.login(token);
//            redisUtils.set(Global.CURRENT_USER, token, MyshopConstants.EXPIRE_TIME);
        } catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        } catch (IncorrectCredentialsException e) {
            return R.error(e.getMessage());
        } catch (LockedAccountException e) {
            return R.error(e.getMessage());
        } catch (AuthenticationException e) {
            return R.error("账户验证失败");
        }
        Subject subject = SecurityUtils.getSubject();
        UserPojo userPojo = (UserPojo) subject.getPrincipal();
        R ret = R.ok();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userPojo, userDto);
        ret.put("user", userDto);
        return ret;
    }

    @ResponseBody
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public R regist(String username, String phone, String password, String captcha) {
        UserPojo userPojo = userService.selectByUserName(username);
        if (userPojo != null) {
            return R.error("用户名已存在");
        }
        userPojo = userService.selectByUserPhone(phone);
        if (userPojo != null) {
            return R.error("手机已注册，可直接登录");
        }
        userPojo = new UserPojo();
        userPojo.setMobile(phone);
        userPojo.setUsername(username);
        String passwordHash256 = new Sha256Hash(password).toHex();
        userPojo.setPassword(passwordHash256);
        userPojo.setRegisterTime(new Date());
        userService.save(userPojo);
        return R.ok();
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
