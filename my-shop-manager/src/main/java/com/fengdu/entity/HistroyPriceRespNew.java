package com.fengdu.entity;

import com.google.common.base.Splitter;
import org.apache.http.util.TextUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by dinghu on 2020/2/21.
 */
public class HistroyPriceRespNew {


    /**
     * data : {"data":[{"price":5499,"time":1568131200000},{"price":5499,"time":1568217600000},{"price":5499,"time":1568304000000},{"price":5499,"time":1568390400000},{"price":5499,"time":1568476800000},{"price":5499,"time":1568563200000},{"price":5499,"time":1568649600000},{"price":5499,"time":1568736000000},{"price":5499,"time":1568822400000},{"price":5499,"time":1568908800000},{"price":5499,"time":1568995200000},{"price":5499,"time":1569081600000},{"price":5499,"time":1569168000000},{"price":5499,"time":1569254400000},{"price":5499,"time":1569340800000},{"price":5499,"time":1569427200000},{"price":5499,"time":1569513600000},{"price":5499,"time":1569600000000},{"price":5499,"time":1569686400000},{"price":5499,"time":1569772800000},{"price":5499,"time":1569859200000},{"price":5499,"time":1569945600000},{"price":5499,"time":1570032000000},{"price":5499,"time":1570118400000},{"price":5499,"time":1570204800000},{"price":5499,"time":1570291200000},{"price":5499,"time":1570377600000},{"price":5499,"time":1570464000000},{"price":5499,"time":1570550400000},{"price":5499,"time":1570636800000},{"price":5499,"time":1570723200000},{"price":5499,"time":1570809600000},{"price":5499,"time":1570896000000},{"price":5499,"time":1570982400000},{"price":5499,"time":1571068800000},{"price":5499,"time":1571155200000},{"price":5499,"time":1571241600000},{"price":5499,"time":1571328000000},{"price":5499,"time":1571414400000},{"price":5499,"time":1571500800000},{"price":5499,"time":1571587200000},{"price":5499,"time":1571673600000},{"price":5499,"time":1571760000000},{"price":5499,"time":1571846400000},{"price":5499,"time":1571932800000},{"price":5499,"time":1572019200000},{"price":5499,"time":1572105600000},{"price":5499,"time":1572192000000},{"price":5499,"time":1572278400000},{"price":5499,"time":1572364800000},{"price":5499,"time":1572451200000},{"price":5499,"time":1572537600000},{"price":5499,"time":1572624000000},{"price":5499,"time":1572710400000},{"price":5499,"time":1572796800000},{"price":5499,"time":1572883200000},{"price":5499,"time":1572969600000},{"price":5499,"time":1573056000000},{"price":5499,"time":1573142400000},{"price":5499,"time":1573228800000},{"price":5499,"time":1573315200000},{"price":5499,"time":1573401600000},{"price":5499,"time":1573488000000},{"price":5499,"time":1573574400000},{"price":5499,"time":1573660800000},{"price":5499,"time":1573747200000},{"price":5499,"time":1573833600000},{"price":5499,"time":1573920000000},{"price":5499,"time":1574006400000},{"price":5499,"time":1574092800000},{"price":5999,"time":1574179200000},{"price":5999,"time":1574265600000},{"price":5999,"time":1574352000000},{"price":5999,"time":1574438400000},{"price":5999,"time":1574524800000},{"price":5999,"time":1574611200000},{"price":5999,"time":1574697600000},{"price":5999,"time":1574784000000},{"price":5999,"time":1574870400000},{"price":5999,"time":1574956800000},{"price":5999,"time":1575043200000},{"price":5999,"time":1575129600000},{"price":5999,"time":1575216000000},{"price":5999,"time":1575302400000},{"price":5999,"time":1575388800000},{"price":5999,"time":1575475200000},{"price":5999,"time":1575561600000},{"price":5999,"time":1575648000000},{"price":5999,"time":1575734400000},{"price":5999,"time":1575820800000},{"price":5999,"time":1575907200000},{"price":5999,"time":1575993600000},{"price":5599,"time":1576080000000},{"price":5999,"time":1576166400000},{"price":5999,"time":1576252800000},{"price":5999,"time":1576339200000},{"price":5999,"time":1576425600000},{"price":5999,"time":1576512000000},{"price":5999,"time":1576598400000},{"price":5999,"time":1576684800000},{"price":5999,"time":1576771200000},{"price":5999,"time":1576857600000},{"price":5999,"time":1576944000000},{"price":5999,"time":1577030400000},{"price":5999,"time":1577116800000},{"price":5999,"time":1577203200000},{"price":5999,"time":1577289600000},{"price":5599,"time":1577376000000},{"price":5999,"time":1577462400000},{"price":5999,"time":1577548800000},{"price":5999,"time":1577635200000},{"price":5599,"time":1577721600000},{"price":5599,"time":1577808000000},{"price":5999,"time":1577894400000},{"price":5999,"time":1577980800000},{"price":5999,"time":1578067200000},{"price":5999,"time":1578153600000},{"price":5999,"time":1578240000000},{"price":5699,"time":1578326400000},{"price":5899,"time":1578412800000},{"price":5599,"time":1578499200000},{"price":5799,"time":1578585600000},{"price":5999,"time":1578672000000},{"price":5699,"time":1578758400000},{"price":5999,"time":1578844800000},{"price":5999,"time":1578931200000},{"price":5699,"time":1579017600000},{"price":5599,"time":1579104000000},{"price":5599,"time":1579190400000},{"price":5999,"time":1579276800000},{"price":5999,"time":1579363200000},{"price":5999,"time":1579449600000},{"price":5999,"time":1579536000000},{"price":5999,"time":1579622400000},{"price":5999,"time":1579708800000},{"price":5999,"time":1579795200000},{"price":5999,"time":1579881600000},{"price":5999,"time":1579968000000},{"price":5999,"time":1580054400000},{"price":5999,"time":1580140800000},{"price":5999,"time":1580227200000},{"price":5999,"time":1580313600000},{"price":5999,"time":1580400000000},{"price":5999,"time":1580486400000},{"price":5999,"time":1580572800000},{"price":5999,"time":1580659200000},{"price":5999,"time":1580745600000},{"price":5999,"time":1580832000000},{"price":5999,"time":1580918400000},{"price":5999,"time":1581004800000},{"price":5999,"time":1581091200000},{"price":5999,"time":1581177600000},{"price":5999,"time":1581264000000},{"price":5999,"time":1581350400000},{"price":5999,"time":1581436800000},{"price":5799,"time":1581523200000},{"price":5999,"time":1581609600000},{"price":5799,"time":1581696000000},{"price":5999,"time":1581782400000},{"price":5999,"time":1581868800000},{"price":5799,"time":1581955200000},{"price":5999,"time":1582041600000},{"price":5999,"time":1582128000000},{"price":5999,"time":1582214400000}],"goodInfo":{"goodPicture":"http://img12.360buyimg.com/n7/jfs/t1/103980/26/12527/248017/5e4a6b2bEde93b893/af9f1eb0617ce599.jpg","goodPrice":"5999.0000","goodTitle":"Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待","goodUrl":"http://item.jd.com/100008348542.html","mallName":"京东商城"},"maxPrice":5999,"minPrice":5499}
     * message : SUCCESS
     * status : 200
     */

    private HistroyPriceEntity data;
    private String message;
    private int status;

    public HistroyPriceEntity getData() {
        return data;
    }

    public void setData(HistroyPriceEntity data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public boolean isJindongUrl(String url) {
        return !TextUtils.isEmpty(url) && (url.contains("jd.com") || url.contains("jingdong.com"));
    }

    public boolean isTaobaoUrl(String url) {
        return !TextUtils.isEmpty(url) && url.contains("taobao.com");
    }

    public boolean isTmallUrl(String url) {
        return !TextUtils.isEmpty(url) && url.contains("tmall.com");
    }

    public static String getParam(String url, String name) {
        String params = url.substring(url.indexOf("?") + 1, url.length());
        Map<String, String> split = Splitter.on("&").withKeyValueSeparator("=").split(params);
        return split.get(name);
    }


    public HistroyPriceResp toJdHistroyPriceResp() {
        HistroyPriceEntity.GoodInfoBean goodInfoBean = getData().getGoodInfo();
        List<HistroyPriceEntity.DataBean> dataBeans = getData().getData();
        URI uri = URI.create(goodInfoBean.getGoodUrl());

        String itemId = null;
        if (isJindongUrl(goodInfoBean.getGoodUrl())) {
            itemId = uri.getPath();
            itemId = itemId.replaceAll("https://item.jd.com/", "");
            itemId = itemId.replaceAll(".html", "");
            itemId = itemId.replaceAll(".htm", "");
            itemId = itemId.replaceAll("/", "");
        } else {
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host) && (host.contains("tmall.com") || host.contains("taobao.com"))) {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && path.equals("/item.htm")) {
                    itemId = getParam(goodInfoBean.getGoodUrl(), "id");
                }
            } else if (!TextUtils.isEmpty(host) && host.contains("ju.taobao.com")) {//https://detail.ju.taobao.com/home.htm?id=10000059407705&item_id=535852953944
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path) && path.equals("/home.htm")) {
                    String item_id = itemId = getParam(goodInfoBean.getGoodUrl(), "item_id");
                    if (!TextUtils.isEmpty(item_id)) {
                        itemId = item_id;
                    }
                }
            }
        }

        HistroyPriceResp histroyPriceResp = new HistroyPriceResp();
        histroyPriceResp.setMessage(getMessage());
        histroyPriceResp.setStatus(getStatus());
        HistroyPriceResp.HistoryPriceEntity historyPriceEntity = new HistroyPriceResp.HistoryPriceEntity();
        historyPriceEntity.setGoodTitle(goodInfoBean.getGoodTitle());
        if (!TextUtils.isEmpty(itemId)) {
            historyPriceEntity.setGoodId(itemId);
        }
        historyPriceEntity.setGoodUrl(goodInfoBean.getGoodUrl());
        historyPriceEntity.setGoodPicture(goodInfoBean.getGoodPicture());
        historyPriceEntity.setGoodPrice(goodInfoBean.getGoodPrice());
        HistroyPriceResp.HistoryPriceEntity.HistoryPriceBean historyPriceBean = new HistroyPriceResp.HistoryPriceEntity.HistoryPriceBean();
        historyPriceBean.setMaxPrice(getData().getMaxPrice());
        historyPriceBean.setMinPrice(getData().getMinPrice());
        List<Integer> data = new ArrayList<>();
        List<String> label = new ArrayList<>();
        for (HistroyPriceEntity.DataBean dataBean : dataBeans) {
            data.add(Integer.valueOf(dataBean.getPrice()));
            label.add(dataBean.getTime() + "");
        }
        historyPriceBean.setData(data);
        historyPriceBean.setLabel(label);
        historyPriceEntity.setHistoryPrice(historyPriceBean);
        histroyPriceResp.setData(historyPriceEntity);

        return histroyPriceResp;
    }

    public static class HistroyPriceEntity {
        /**
         * data : [{"price":5499,"time":1568131200000},{"price":5499,"time":1568217600000},{"price":5499,"time":1568304000000},{"price":5499,"time":1568390400000},{"price":5499,"time":1568476800000},{"price":5499,"time":1568563200000},{"price":5499,"time":1568649600000},{"price":5499,"time":1568736000000},{"price":5499,"time":1568822400000},{"price":5499,"time":1568908800000},{"price":5499,"time":1568995200000},{"price":5499,"time":1569081600000},{"price":5499,"time":1569168000000},{"price":5499,"time":1569254400000},{"price":5499,"time":1569340800000},{"price":5499,"time":1569427200000},{"price":5499,"time":1569513600000},{"price":5499,"time":1569600000000},{"price":5499,"time":1569686400000},{"price":5499,"time":1569772800000},{"price":5499,"time":1569859200000},{"price":5499,"time":1569945600000},{"price":5499,"time":1570032000000},{"price":5499,"time":1570118400000},{"price":5499,"time":1570204800000},{"price":5499,"time":1570291200000},{"price":5499,"time":1570377600000},{"price":5499,"time":1570464000000},{"price":5499,"time":1570550400000},{"price":5499,"time":1570636800000},{"price":5499,"time":1570723200000},{"price":5499,"time":1570809600000},{"price":5499,"time":1570896000000},{"price":5499,"time":1570982400000},{"price":5499,"time":1571068800000},{"price":5499,"time":1571155200000},{"price":5499,"time":1571241600000},{"price":5499,"time":1571328000000},{"price":5499,"time":1571414400000},{"price":5499,"time":1571500800000},{"price":5499,"time":1571587200000},{"price":5499,"time":1571673600000},{"price":5499,"time":1571760000000},{"price":5499,"time":1571846400000},{"price":5499,"time":1571932800000},{"price":5499,"time":1572019200000},{"price":5499,"time":1572105600000},{"price":5499,"time":1572192000000},{"price":5499,"time":1572278400000},{"price":5499,"time":1572364800000},{"price":5499,"time":1572451200000},{"price":5499,"time":1572537600000},{"price":5499,"time":1572624000000},{"price":5499,"time":1572710400000},{"price":5499,"time":1572796800000},{"price":5499,"time":1572883200000},{"price":5499,"time":1572969600000},{"price":5499,"time":1573056000000},{"price":5499,"time":1573142400000},{"price":5499,"time":1573228800000},{"price":5499,"time":1573315200000},{"price":5499,"time":1573401600000},{"price":5499,"time":1573488000000},{"price":5499,"time":1573574400000},{"price":5499,"time":1573660800000},{"price":5499,"time":1573747200000},{"price":5499,"time":1573833600000},{"price":5499,"time":1573920000000},{"price":5499,"time":1574006400000},{"price":5499,"time":1574092800000},{"price":5999,"time":1574179200000},{"price":5999,"time":1574265600000},{"price":5999,"time":1574352000000},{"price":5999,"time":1574438400000},{"price":5999,"time":1574524800000},{"price":5999,"time":1574611200000},{"price":5999,"time":1574697600000},{"price":5999,"time":1574784000000},{"price":5999,"time":1574870400000},{"price":5999,"time":1574956800000},{"price":5999,"time":1575043200000},{"price":5999,"time":1575129600000},{"price":5999,"time":1575216000000},{"price":5999,"time":1575302400000},{"price":5999,"time":1575388800000},{"price":5999,"time":1575475200000},{"price":5999,"time":1575561600000},{"price":5999,"time":1575648000000},{"price":5999,"time":1575734400000},{"price":5999,"time":1575820800000},{"price":5999,"time":1575907200000},{"price":5999,"time":1575993600000},{"price":5599,"time":1576080000000},{"price":5999,"time":1576166400000},{"price":5999,"time":1576252800000},{"price":5999,"time":1576339200000},{"price":5999,"time":1576425600000},{"price":5999,"time":1576512000000},{"price":5999,"time":1576598400000},{"price":5999,"time":1576684800000},{"price":5999,"time":1576771200000},{"price":5999,"time":1576857600000},{"price":5999,"time":1576944000000},{"price":5999,"time":1577030400000},{"price":5999,"time":1577116800000},{"price":5999,"time":1577203200000},{"price":5999,"time":1577289600000},{"price":5599,"time":1577376000000},{"price":5999,"time":1577462400000},{"price":5999,"time":1577548800000},{"price":5999,"time":1577635200000},{"price":5599,"time":1577721600000},{"price":5599,"time":1577808000000},{"price":5999,"time":1577894400000},{"price":5999,"time":1577980800000},{"price":5999,"time":1578067200000},{"price":5999,"time":1578153600000},{"price":5999,"time":1578240000000},{"price":5699,"time":1578326400000},{"price":5899,"time":1578412800000},{"price":5599,"time":1578499200000},{"price":5799,"time":1578585600000},{"price":5999,"time":1578672000000},{"price":5699,"time":1578758400000},{"price":5999,"time":1578844800000},{"price":5999,"time":1578931200000},{"price":5699,"time":1579017600000},{"price":5599,"time":1579104000000},{"price":5599,"time":1579190400000},{"price":5999,"time":1579276800000},{"price":5999,"time":1579363200000},{"price":5999,"time":1579449600000},{"price":5999,"time":1579536000000},{"price":5999,"time":1579622400000},{"price":5999,"time":1579708800000},{"price":5999,"time":1579795200000},{"price":5999,"time":1579881600000},{"price":5999,"time":1579968000000},{"price":5999,"time":1580054400000},{"price":5999,"time":1580140800000},{"price":5999,"time":1580227200000},{"price":5999,"time":1580313600000},{"price":5999,"time":1580400000000},{"price":5999,"time":1580486400000},{"price":5999,"time":1580572800000},{"price":5999,"time":1580659200000},{"price":5999,"time":1580745600000},{"price":5999,"time":1580832000000},{"price":5999,"time":1580918400000},{"price":5999,"time":1581004800000},{"price":5999,"time":1581091200000},{"price":5999,"time":1581177600000},{"price":5999,"time":1581264000000},{"price":5999,"time":1581350400000},{"price":5999,"time":1581436800000},{"price":5799,"time":1581523200000},{"price":5999,"time":1581609600000},{"price":5799,"time":1581696000000},{"price":5999,"time":1581782400000},{"price":5999,"time":1581868800000},{"price":5799,"time":1581955200000},{"price":5999,"time":1582041600000},{"price":5999,"time":1582128000000},{"price":5999,"time":1582214400000}]
         * goodInfo : {"goodPicture":"http://img12.360buyimg.com/n7/jfs/t1/103980/26/12527/248017/5e4a6b2bEde93b893/af9f1eb0617ce599.jpg","goodPrice":"5999.0000","goodTitle":"Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待","goodUrl":"http://item.jd.com/100008348542.html","mallName":"京东商城"}
         * maxPrice : 5999
         * minPrice : 5499
         */

        private GoodInfoBean goodInfo;
        private int maxPrice;
        private int minPrice;
        private List<DataBean> data;

        public GoodInfoBean getGoodInfo() {
            return goodInfo;
        }

        public void setGoodInfo(GoodInfoBean goodInfo) {
            this.goodInfo = goodInfo;
        }

        public int getMaxPrice() {
            return maxPrice;
        }

        public void setMaxPrice(int maxPrice) {
            this.maxPrice = maxPrice;
        }

        public int getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(int minPrice) {
            this.minPrice = minPrice;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class GoodInfoBean {
            /**
             * goodPicture : http://img12.360buyimg.com/n7/jfs/t1/103980/26/12527/248017/5e4a6b2bEde93b893/af9f1eb0617ce599.jpg
             * goodPrice : 5999.0000
             * goodTitle : Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待
             * goodUrl : http://item.jd.com/100008348542.html
             * mallName : 京东商城
             */

            private String goodPicture;
            private String goodPrice;
            private String goodTitle;
            private String goodUrl;
            private String mallName;

            public String getGoodPicture() {
                return goodPicture;
            }

            public void setGoodPicture(String goodPicture) {
                this.goodPicture = goodPicture;
            }

            public String getGoodPrice() {
                return goodPrice;
            }

            public void setGoodPrice(String goodPrice) {
                this.goodPrice = goodPrice;
            }

            public String getGoodTitle() {
                return goodTitle;
            }

            public void setGoodTitle(String goodTitle) {
                this.goodTitle = goodTitle;
            }

            public String getGoodUrl() {
                return goodUrl;
            }

            public void setGoodUrl(String goodUrl) {
                this.goodUrl = goodUrl;
            }

            public String getMallName() {
                return mallName;
            }

            public void setMallName(String mallName) {
                this.mallName = mallName;
            }
        }

        public static class DataBean {
            /**
             * price : 5499
             * time : 1568131200000
             */

            private int price;
            private long time;

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }
        }
    }
}
