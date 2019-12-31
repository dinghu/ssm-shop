package com.fengdu.entity;

import java.util.List;

public class JingdongCouponResp {
    /**
     * code : 200
     * msg : 搜索成功
     * data : [{"coupon_share_url":"https://union-click.jd.com/jdc?e=&p=AyIGZRtcFAcWAVUaXxUyEgZUGloWABUPVB9SJUZNXwtEa0xHV0YXEEULWUpYA0wPSh1JUkpJBUkcSkIBR0RMR05aW1kBUQ4SBlQaWhYAFQ9UH1ICQh5zLGs%2BYnF1RSFEM0V1YXQJYyJMdHJeVB0td2pwczFnUnVdcX41fyhKdU14Jm84bkBmfg97L0x5UmQ8ZC1uYUdEIkQzc3thUgljK35JRgYpQTtgeXZnD0IMYQB6YSxoDlF1a108YDsBAGcTV25rclUQQD1TOA9hZXUTTC9CYXRZIkgwdQ4eN1UdWBQFGwdXElslAhMGVRlcFgoRBWUrWxQyUGmCn8TDp7zTyohbFAoiB10eXhQHEANXHmsVBhQBUx1bEwEXB1EdaxUKFTcJTwNCUk1QBURbFgAiN2UYayUyEgRlG2tKRk9aZRlaFAAQ","coupon_url":"https://coupon.jd.com/ilink/couponActiveFront/front_index.action?key=8ef8e8f15fbc4dee973b572193674d3e&roleId=25765828&to=https://mall.jd.com/index-1000131362.html","pict_url":"http://img14.360buyimg.com/ads/jfs/t1/85039/9/8959/175850/5e09acaeEe96a7ba1/3823569a794ec839.jpg","price":1999,"shop_title":"华凌空调京东自营官方旗舰店","item_id":100002369058,"item_title":"华凌空调 大1.5匹 冷暖变频 空调挂机 三级能效 卧室壁挂式 防直吹空调 KFR-35GW/HAN8B3","volume":"2.01万","cid3":870,"cid2":794,"coupon_start_time":"2019-12-01","coupon_end_time":"2019-12-31","coupon_amount":20,"juanhou_price":1979,"quota":1000}]
     * is_tips : 0
     * rd : xq_jd2_search_inOrderCount30Days_desc_0_1_20_100002369058
     */

    private int code;
    private String msg;
    private String is_tips;
    private String rd;
    private List<JingdongCouponEntity> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getIs_tips() {
        return is_tips;
    }

    public void setIs_tips(String is_tips) {
        this.is_tips = is_tips;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    public List<JingdongCouponEntity> getData() {
        return data;
    }

    public void setData(List<JingdongCouponEntity> data) {
        this.data = data;
    }
}
