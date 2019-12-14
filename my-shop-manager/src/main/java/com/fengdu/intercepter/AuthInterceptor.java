package com.fengdu.intercepter;

import com.fengdu.utils.TokenUtils;
import org.apache.http.util.TextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.fengdu.constant.MyshopConstants.AUTH_TOKEN_HEADER_NAME;

/**
 * 权限拦截
 * 
 * @author adminstrator
 *
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
	private final static Logger LOG = LoggerFactory.getLogger(AuthInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		// 获取头信息中的token
		String authorizationHeader = request.getHeader(AUTH_TOKEN_HEADER_NAME);
		if (TextUtils.isBlank(authorizationHeader)) {
			response.setStatus(800);
			return false;
		}
		if (!TokenUtils.verifyToken(authorizationHeader)) {
			response.setStatus(800);
			return false;
		}
		return true;
	}

//	private boolean sourceIsContainsUri(HttpServletRequest request, String allUri) {
//		if (null == allUri) {
//			return false;
//		}
//		String uri = request.getRequestURI();
//		// 去除参数和.htm
//		uri = uri.split("\\.")[0];
//		// 当前登录人员的资源全uri
//		return allUri.contains(uri);
//	}
//
//	private boolean isAjaxRequest(HttpServletRequest request) {
//		// 判断是否ajax请求
//		final String ajaxHeader = request.getHeader("x-requested-with");
//		return !StringUtil.isNull(ajaxHeader) && "XMLHttpRequest".equalsIgnoreCase(ajaxHeader);
//	}

}
