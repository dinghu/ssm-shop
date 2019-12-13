package com.fengdu.utils;

import com.fengdu.constant.MyshopConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.http.util.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.Base64;

/**
 * TOKEN的加密解密
 *
 * @author Administrator
 */
public class TokenUtils {

    public static final String JWT_ID = "yun-shop";
    public static final String JWT_AUD = "yunshop@studio";
    public static final String JWT_SUB = "yunshop@studio@sub";
    public static final long JWT_TTL = 12 * 30 * 24 * 60 * 60 * 1000L;
    // // millisecond
    public static final long JWT_REFRESH_INTERVAL = 55 * 60 * 1000L; // millisecond
    public static final long JWT_REFRESH_TTL = 12 * 60 * 60 * 1000L; // millisecond

    /**
     * 由字符串生成加密key
     *
     * @return
     */
    public static SecretKey generateGeneralKey() {
        String stringKey = MyshopConstants.JWT_SECRET;
        byte[] encodedKey = Base64.decodeFast(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 创建jwt
     *
     * @param jwt_id
     * @param ttlMillis
     * @return
     * @throws Exception
     */
    public static String createJWT(String jwt_id, long ttlMillis, JSONObject userInfo) throws Exception {

        long nowMillis = System.currentTimeMillis();
        userInfo.put("iat", nowMillis);
        userInfo.put("aud", JWT_AUD);
        userInfo.put("sub", JWT_SUB);
        String subject = userInfo.toJSONString();
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS512;

        Date now = new Date(nowMillis);
        SecretKey key = generateGeneralKey();

        JwtBuilder builder = Jwts.builder().setId(jwt_id).setIssuedAt(now).setSubject(subject)
                .signWith(signatureAlgorithm, key);
        // if (ttlMillis >= 0)
        {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    /**
     * 解密jwt
     *
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String jwt) throws Exception {
        SecretKey key = generateGeneralKey();
        Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(jwt).getBody();
        return claims;
    }

    /**
     * 解密jwt
     *
     * @param jwt
     * @return
     * @throws Exception
     */
    public static String getSubject(String jwt) throws Exception {
        SecretKey key = generateGeneralKey();
        String sub = Jwts.parser().setSigningKey(key).parseClaimsJws(jwt).getBody().getSubject();
        return sub;
    }

    /**
     * 验证TOken
     */
    public static boolean verifyToken(String token) {
        // 验证TOKEN 1 有效期 2 解密 3 重新签名
        try {
            if (!TextUtils.isEmpty(token)) {
                // 解密
                Claims clms = parseJWT(token);
                if (clms != null) {
                    // TOKEN过期
                    // Date exp = clms.getExpiration();
                    // long nowMillis = System.currentTimeMillis();
                    // Date now = new Date(nowMillis);
                    // if (now.after(exp)) {
                    // return false;
                    // }
                    String subject = clms.getSubject();
                    if (!TextUtils.isEmpty(subject)) {
                        // 验证 aud sub
                        JSONObject jobj = JSONObject.parseObject(subject);
                        if (jobj.containsKey("aud") && jobj.containsKey("sub") && jobj.containsKey("iat")) {
                            if (JWT_AUD.equals(jobj.getString("aud")) && JWT_SUB.equals(jobj.getString("sub"))) {
                                return true;
                                // String iat = jobj.getString("iat");
                                // // 再次签名
                                // SignatureAlgorithm signatureAlgorithm =
                                // SignatureAlgorithm.HS512;
                                // SecretKey key = generateGeneralKey();
                                // Date dIat = new Date(Long.valueOf(iat));
                                // JwtBuilder builder =
                                // Jwts.builder().setId(JWT_ID).setIssuedAt(dIat).setSubject(subject)
                                // .signWith(signatureAlgorithm, key);
                                // builder.setExpiration(exp);
                                // String sign = builder.compact();
                                // if (sign.equals(token)) {
                                // return true;
                                // }

                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    /**
     * 通过refreshToken刷新TOKEN
     *
     * @param refreshToken
     */
    public static void refreshToken(String refreshToken) {

    }

    /**
     * use
     */
    public static void testToken() {
        try {
            String token = TokenUtils.createJWT(TokenUtils.JWT_ID, TokenUtils.JWT_TTL, new JSONObject());
            String refreshToken = TokenUtils.createJWT(TokenUtils.JWT_ID, TokenUtils.JWT_REFRESH_TTL, new JSONObject());
            JSONObject jo = new JSONObject();
            jo.put("token", token);
            jo.put("refreshToken", refreshToken);

            // String cheatToken =
            // "eyJqdGkiOiJzdGFyLWN1c3RvbSIsImlhdCI6MTQ5MjA2NjA5Miwic3ViIjoie1wiYXVkXCI6XCJ5aW5naHVvY2hvbmdAc3R1ZGlvXCIsXCJzdWJcIjpcInlpbmdodW9jaG9uZ0BzdHVkaW9Ac3ViXCIsXCJ1c2VySWRcIjpcImRpbmdodSB1aWRcIixcImlhdFwiOjE0OTIwNjYwOTI0NjV9IiwiZXhwIjoxNDkyMDY5NjkyfQ";

            // 验证TOKEN
            boolean ret = TokenUtils.verifyToken(token);

            System.out.println("verifyToken:" + ret);

            // 验证TOKEN
            boolean ret2 = TokenUtils.verifyToken(refreshToken);

            System.out.println("refreshToken:" + ret2);

            // 验证TOKEN
            // boolean ret1 = TokenUtils.verifyToken(cheatToken);

            // System.out.println("cheatToken:" + ret1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testToken();
    }

}
