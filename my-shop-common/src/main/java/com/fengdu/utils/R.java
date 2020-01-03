package com.fengdu.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2016年10月27日 下午9:59:27
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 200);
        put("msg", "操作成功");
    }

    public void setError(String message) {
        put("msg", message);
    }

    public void setError(int code, String message) {
        put("code", code);
        put("msg", message);
    }

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R paramsError() {
        return error(500, "参数错误");
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public void setOk() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static R result() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
