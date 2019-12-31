package com.fengdu.entity;

import java.util.List;

public class JingdongCouponEntity {
    /**
     * coupon_share_url : https://union-click.jd.com/jdc?e=&p=AyIGZRtcFAcWAVUaXxUyEgZUGloWABUPVB9SJUZNXwtEa0xHV0YXEEULWUpYA0wPSh1JUkpJBUkcSkIBR0RMR05aW1kBUQ4SBlQaWhYAFQ9UH1ICQh5zLGs%2BYnF1RSFEM0V1YXQJYyJMdHJeVB0td2pwczFnUnVdcX41fyhKdU14Jm84bkBmfg97L0x5UmQ8ZC1uYUdEIkQzc3thUgljK35JRgYpQTtgeXZnD0IMYQB6YSxoDlF1a108YDsBAGcTV25rclUQQD1TOA9hZXUTTC9CYXRZIkgwdQ4eN1UdWBQFGwdXElslAhMGVRlcFgoRBWUrWxQyUGmCn8TDp7zTyohbFAoiB10eXhQHEANXHmsVBhQBUx1bEwEXB1EdaxUKFTcJTwNCUk1QBURbFgAiN2UYayUyEgRlG2tKRk9aZRlaFAAQ
     * coupon_url : https://coupon.jd.com/ilink/couponActiveFront/front_index.action?key=8ef8e8f15fbc4dee973b572193674d3e&roleId=25765828&to=https://mall.jd.com/index-1000131362.html
     * pict_url : http://img14.360buyimg.com/ads/jfs/t1/85039/9/8959/175850/5e09acaeEe96a7ba1/3823569a794ec839.jpg
     * price : 1999
     * shop_title : 华凌空调京东自营官方旗舰店
     * item_id : 100002369058
     * item_title : 华凌空调 大1.5匹 冷暖变频 空调挂机 三级能效 卧室壁挂式 防直吹空调 KFR-35GW/HAN8B3
     * volume : 2.01万
     * cid3 : 870
     * cid2 : 794
     * coupon_start_time : 2019-12-01
     * coupon_end_time : 2019-12-31
     * coupon_amount : 20
     * juanhou_price : 1979
     * quota : 1000
     */

    private String coupon_share_url;
    private String coupon_url;
    private String pict_url;
    private int price;
    private String shop_title;
    private long item_id;
    private String item_title;
    private String volume;
    private int cid3;
    private int cid2;
    private String coupon_start_time;
    private String coupon_end_time;
    private int coupon_amount;
    private int juanhou_price;
    private int quota;

    public String getCoupon_share_url() {
        return coupon_share_url;
    }

    public void setCoupon_share_url(String coupon_share_url) {
        this.coupon_share_url = coupon_share_url;
    }

    public String getCoupon_url() {
        return coupon_url;
    }

    public void setCoupon_url(String coupon_url) {
        this.coupon_url = coupon_url;
    }

    public String getPict_url() {
        return pict_url;
    }

    public void setPict_url(String pict_url) {
        this.pict_url = pict_url;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShop_title() {
        return shop_title;
    }

    public void setShop_title(String shop_title) {
        this.shop_title = shop_title;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getItem_title() {
        return item_title;
    }

    public void setItem_title(String item_title) {
        this.item_title = item_title;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getCid3() {
        return cid3;
    }

    public void setCid3(int cid3) {
        this.cid3 = cid3;
    }

    public int getCid2() {
        return cid2;
    }

    public void setCid2(int cid2) {
        this.cid2 = cid2;
    }

    public String getCoupon_start_time() {
        return coupon_start_time;
    }

    public void setCoupon_start_time(String coupon_start_time) {
        this.coupon_start_time = coupon_start_time;
    }

    public String getCoupon_end_time() {
        return coupon_end_time;
    }

    public void setCoupon_end_time(String coupon_end_time) {
        this.coupon_end_time = coupon_end_time;
    }

    public int getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(int coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public int getJuanhou_price() {
        return juanhou_price;
    }

    public void setJuanhou_price(int juanhou_price) {
        this.juanhou_price = juanhou_price;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
