package com.fengdu.entity;

public class TaobaoCouponEntity {
    /**
     * xsd : 1
     * coupon_amount : 0
     * coupon_share_url : https://s.click.taobao.com/t?e=m%3D2%26s%3DMonSNwkcer1w4vFB6t2Z2ueEDrYVVa64r4ll3HtqqoxyINtkUhsv0J2JvRty%2BgidOqvukwxSYK2iOaEXpOEJwtX%2BWgyMwJvSfo23MvRSCv2UuyZC7fbJp19EeTtntI44k%2BAXm78wM%2BmdSGLCtIBjlDnpmhTObRx2SFRIh0OtjeS1YAp%2BHH38ItGx8DOSMPWF2JQR4fLCt9jypEpJpuvo6FlDIT%2FuwZjYIYULNg46oBA%3D&scm=null&pvid=100_11.178.149.228_1549_891577771834480670&app_pvid=59590_11.132.118.135_520_1577771834474&ptl=floorId:2836;originalFloorId:2836;pvid:100_11.178.149.228_1549_891577771834480670;app_pvid:59590_11.132.118.135_520_1577771834474&xId=6nfHCVYgq3V6jAEU5BIO2EVbFKrW2LGjyTO6s4kon7JpKLaSzK12ahEDm5NwnJvWV0XEGn16nHqRFpwtJ8WoeY0ZDjlY3Bnw9WUAggOcYCwg&union_lens=lensId%3AMAPI%401577771834%400b847687_0d3e_16f5a879c99_c23d%4001
     * commission_rate : 200
     * price : 86
     * title : 梳妆台化妆台卧室 现代简约收纳柜一体台桌小型北欧网红ins风桌子
     * pict_url : https://img.alicdn.com/bao/uploaded/i3/2013534342/O1CN01jwV4CC1hwgIb7iJ9n_!!0-item_pic.jpg
     * item_url : https://detail.m.tmall.com/item.htm?id=608058212581
     * shop_title : 欧意朗旗舰店
     * user_type : 1
     * category_id : 50001385
     * volume_sort : 443
     * volume : 443
     * item_id : 608058212581
     * pwd : ￥ZGHu1by9Nvw￥
     * juanhou_price : 86.00
     * coupon_start_time : 2019.11.14
     * coupon_end_time : 2019.12.31
     */

    private int xsd;
    private int coupon_amount;
    private String coupon_share_url;
    private String commission_rate;
    private String price;
    private String title;
    private String pict_url;
    private String item_url;
    private String shop_title;
    private int user_type;
    private int category_id;
    private int volume_sort;
    private String volume;
    private long item_id;
    private String pwd;
    private String juanhou_price;
    private String coupon_start_time;
    private String coupon_end_time;

    public int getXsd() {
        return xsd;
    }

    public void setXsd(int xsd) {
        this.xsd = xsd;
    }

    public int getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(int coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public String getCoupon_share_url() {
        return coupon_share_url;
    }

    public void setCoupon_share_url(String coupon_share_url) {
        this.coupon_share_url = coupon_share_url;
    }

    public String getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(String commission_rate) {
        this.commission_rate = commission_rate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPict_url() {
        return pict_url;
    }

    public void setPict_url(String pict_url) {
        this.pict_url = pict_url;
    }

    public String getItem_url() {
        return item_url;
    }

    public void setItem_url(String item_url) {
        this.item_url = item_url;
    }

    public String getShop_title() {
        return shop_title;
    }

    public void setShop_title(String shop_title) {
        this.shop_title = shop_title;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getVolume_sort() {
        return volume_sort;
    }

    public void setVolume_sort(int volume_sort) {
        this.volume_sort = volume_sort;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getJuanhou_price() {
        return juanhou_price;
    }

    public void setJuanhou_price(String juanhou_price) {
        this.juanhou_price = juanhou_price;
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
}
