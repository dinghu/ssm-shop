package com.fengdu.realm;

import com.fengdu.Global;
import com.fengdu.constant.MyshopConstants;
import com.fengdu.dao.UserLevelPojoMapper;
import com.fengdu.pojo.UserLevelPojo;
import com.fengdu.pojo.UserPojo;
import com.fengdu.service.UserService;
import com.fengdu.utils.RedisUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    @Autowired
    private UserLevelPojoMapper userLevelPojoMapper;
    @Autowired
    private RedisUtils redisUtils;

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserPojo user = (UserPojo) principals.getPrimaryPrincipal();
        UserLevelPojo userLevelPojo = userLevelPojoMapper.selectByPrimaryKey(user.getUserLevelId());
        //通过用户名从数据库获取权限/角色信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> r = new HashSet<String>();
        if (userLevelPojo != null) {
            r.add(userLevelPojo.getName());
            info.setRoles(r);
        }
        return info;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        //查询用户信息
        UserPojo user = userService.queryByAccount(username);

        //账号不存在
        if (user == null) {
            throw new UnknownAccountException("账号不存在");
        }

        //密码错误
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("密码不正确");
        }

        //账号锁定
        if (user.getStatus() == 0) {
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        // 把当前用户放入到session中
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession(true);
        session.setAttribute(Global.CURRENT_USER, user);

        redisUtils.set(Global.CURRENT_USER, user, MyshopConstants.EXPIRE_TIME);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }
}
