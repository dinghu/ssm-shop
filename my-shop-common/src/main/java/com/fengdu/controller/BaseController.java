package com.fengdu.controller;

import com.alibaba.fastjson.JSONObject;
import com.fengdu.utils.TokenUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.util.TextUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

import static com.fengdu.constant.MyshopConstants.AUTH_TOKEN_HEADER_NAME;

public class BaseController {

    protected HttpServletRequest getHttpServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request;
    }

    protected String getJwtToken() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader(AUTH_TOKEN_HEADER_NAME);
        return token;
    }


    public String getUserIdFromRequest() {
        String token = getJwtToken();
        if (TextUtils.isEmpty(token)) {
            return null;
        }
        try {
            String userInfostr = TokenUtils.getSubject(token);
            JSONObject userInfoJson = JSONObject.parseObject(userInfostr);
            String uid = userInfoJson.getString("id");
            return uid;
        } catch (Exception e) {
            throw new RuntimeException("登录信息失效异常，请重新登录");
        }
    }

    protected String getStringParameter(String name) {
        return getStringParameter(name, null);
    }

    protected String getStringParameter(String name, String defaultValue) {
        String value = getHttpServletRequest().getParameter(name);

        return StringUtils.isEmpty(value) ? defaultValue : value.trim();
    }

    protected BigDecimal getBigDecimalParameter(String name) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? null : new BigDecimal(value);
    }

    protected BigDecimal getBigDecimalParameter(String name, String defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? new BigDecimal(defaultValue) : new BigDecimal(value);
    }

    protected Boolean getBooleanParameter(String name) {
        return getBooleanParameter(name, null);
    }

    protected Boolean getBooleanParameter(String name, Boolean defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? defaultValue : Boolean.valueOf(value);
    }

    protected Integer getIntegerParameter(String name) {
        return getIntegerParameter(name, null);
    }

    protected Integer getIntegerParameter(String name, Integer defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? defaultValue : Integer.valueOf(value);
    }

    protected Long getLongParameter(String name) {
        return getLongParameter(name, null);
    }

    protected Long getLongParameter(String name, Long defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? defaultValue : Long.valueOf(value);
    }

    protected Float getFloatParameter(String name) {
        return getFloatParameter(name, null);
    }

    protected Float getFloatParameter(String name, Float defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? defaultValue : Float.valueOf(value);
    }

    protected Double getDoubleParameter(String name) {
        return getDoubleParameter(name, null);
    }

    protected Double getDoubleParameter(String name, Double defaultValue) {
        String value = getHttpServletRequest().getParameter(name);
        return StringUtils.isEmpty(value) ? defaultValue : Double.valueOf(value);
    }

}
