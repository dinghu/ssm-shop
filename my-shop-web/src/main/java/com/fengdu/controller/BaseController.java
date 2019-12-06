package com.fengdu.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

public class BaseController {

    protected HttpServletRequest getHttpServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request;
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
