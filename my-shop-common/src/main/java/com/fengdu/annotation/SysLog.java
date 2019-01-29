package com.fengdu.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017年3月8日 上午10:19:56
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "操作日志";
}
