package com.fengdu.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.xmlbeans.impl.regex.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http客户端工具
 * 
 * @author zhihongp
 * 
 */
public class HttpClientUtil {

	private static final Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

	private static String DEFAULT_CHARSET = "UTF-8";

	private static int DEFAULT_PORT = 80;

	/**
	 * http get请求
	 * 
	 * @param url 请求的地址
	 * @return 响应结果(字符串)
	 */
	public static String get(String url) {
		return get(url, DEFAULT_CHARSET);
	}

	/**
	 * http get请求
	 * 
	 * @param url 请求的地址
	 * @param charSet 字符串编码格式
	 * @return 响应结果(字符串)
	 */
	public static String get(String url, String charSet) {
		String responseStr = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			HttpGet httpGet = new HttpGet(url);
			// Header header = new BasicHeader("Host", "www.sztx.com");
			// httpGet.setHeader(header);
			CloseableHttpResponse response = httpclient.execute(httpGet);

			try {
				HttpEntity entity = response.getEntity();

				if (entity != null) {
					responseStr = EntityUtils.toString(entity, charSet);
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			log.error("Http get request error", e);
		} catch (ParseException e) {
			log.error("Http get request error", e);
		} catch (IOException e) {
			log.error("Http get request error", e);
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				log.error("Httpclient close error", e);
			}
		}

		return responseStr;
	}

	/**
	 * http提交post请求
	 * 
	 * @param url 请求的地址
	 * @param paramterMap 请求的参数集合
	 * @return 响应结果(字符串)
	 * @throws Exception
	 */
	public static String post(String url, Map<String, String> paramterMap) throws Exception {
		return post(url, paramterMap, DEFAULT_CHARSET);
	}

	/**
	 * http提交post请求
	 * 
	 * @param url 请求的地址
	 * @param paramterMap 请求的参数集合
	 * @param charSet 字符集
	 * @return 响应结果(字符串)
	 * @throws Exception
	 */
	public static String post(String url, Map<String, String> paramterMap, String charSet) throws Exception {
		String responseStr = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		Set<Entry<String, String>> set = paramterMap.entrySet();

		for (Entry<String, String> entry : set) {
			params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}

		try {
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(params, charSet);
			httpPost.setEntity(uefEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);

			try {
				HttpEntity entity = response.getEntity();

				if (entity != null) {
					responseStr = EntityUtils.toString(entity, charSet);
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			log.error("Http post request error", e);
		} catch (UnsupportedEncodingException e) {
			log.error("Http post request error", e);
		} catch (IOException e) {
			log.error("Http post request error", e);
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				log.error("Httpclient close error", e);
			}
		}

		return responseStr;
	}

	/**
	 * http提交purge请求
	 * 
	 * @param
	 * @param url
	 * @return
	 */
	public static String purge(String varnishIp, String url) {
		String responseStr = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			HttpPurge httpPurge = new HttpPurge(url);
			RequestConfig requestConfig = RequestConfig.custom().setProxy(new HttpHost(varnishIp, DEFAULT_PORT)).build();
			httpPurge.setConfig(requestConfig);
			CloseableHttpResponse response = httpclient.execute(httpPurge);

			try {
				HttpEntity entity = response.getEntity();

				if (entity != null) {
					responseStr = EntityUtils.toString(entity, DEFAULT_CHARSET);
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			log.error("Http purge request error", e);
		} catch (ParseException e) {
			log.error("Http purge request error", e);
		} catch (IOException e) {
			log.error("Http purge request error", e);
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				log.error("Httpclient close error", e);
			}
		}

		return responseStr;
	}

	static class HttpPurge extends HttpRequestBase {
		public final static String METHOD_NAME = "PURGE";

		public HttpPurge() {
			super();
		}

		public HttpPurge(final URI uri) {
			super();
			setURI(uri);
		}

		public HttpPurge(final String uri) {
			super();
			setURI(URI.create(uri));
		}

		@Override
		public String getMethod() {
			return METHOD_NAME;
		}

	}

}
