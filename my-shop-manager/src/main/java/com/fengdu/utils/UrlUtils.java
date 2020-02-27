package com.fengdu.utils;

import org.apache.http.util.TextUtils;

public class UrlUtils {

    public static boolean isUrl(String url) {
        return !TextUtils.isEmpty(url) && (url.startsWith("http") || url.startsWith("https"));
    }

    public static boolean isJindongUrl(String url) {
        return !TextUtils.isEmpty(url) && (url.contains("jd.com") || url.contains("jingdong.com"));
    }

    public static boolean isTaobaoUrl(String url) {
        return !TextUtils.isEmpty(url) && url.contains("taobao.com");
    }

    public static boolean isTmallUrl(String url) {
        return !TextUtils.isEmpty(url) && url.contains("tmall.com");
    }
}
