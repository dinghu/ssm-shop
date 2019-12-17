package com.fengdu.api;

import com.fengdu.controller.CollectController;
import com.fengdu.entity.CollectEntity;
import com.fengdu.entity.GoodsCollectEntity;
import com.fengdu.service.CollectService;
import com.fengdu.utils.R;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/collet")
public class ApiColletController extends CollectController {

    @RequestMapping("/cancle")
    public R delete(HttpServletRequest req) {
        String userId = getUserIdFromRequest();
        Integer valueId = getIntegerParameter("commodityId", -1);
        if (TextUtils.isEmpty(userId) || -1 == valueId) {
            return R.paramsError();
        }
        Map param = new HashMap();
        param.put("userId", userId);
        param.put("valueId", valueId);
        collectService.deletebyUidAndVid(param);
        return R.ok();
    }

    @RequestMapping("/isCollet")
    public R isCollet(HttpServletRequest req) {
        String userId = getUserIdFromRequest();
        Integer valueId = getIntegerParameter("commodityId", -1);
        if (-1 == valueId) {
            return R.paramsError();
        }
        Map param = new HashMap();
        param.put("userId", userId);
        param.put("valueId", valueId);
        CollectEntity collectEntity = collectService.queryObjectbyUidAndVid(param);
        R rok = R.ok();
        Map paramRet = new HashMap();
        paramRet.put("isCollet", collectEntity != null);
        rok.put("data", paramRet);
        return rok;
    }

    /**
     * 保存
     */
    @RequestMapping("/add")
    public R save(HttpServletRequest req) {
        String uid = getUserIdFromRequest();
        Integer vid = getIntegerParameter("commodityId", -1);
        if (-1 == vid) {
            return R.paramsError();
        }
        CollectEntity collectEntity = new CollectEntity();
        collectEntity.setUserId(Long.valueOf(uid));
        collectEntity.setAddTime(System.currentTimeMillis());
        collectEntity.setValueId(vid);
        collectEntity.setTypeId(1);//1代表优惠商品
        collectService.save(collectEntity);
        return R.ok();
    }

    /**
     * 保存
     */
    @RequestMapping("/colletlist")
    public R colletlist(HttpServletRequest req) {
        String uid = getUserIdFromRequest();
        Integer type = getIntegerParameter("type", -1);
        if (-1 == type) {
            return R.paramsError();
        }
        Integer pageNo = getIntegerParameter("pageNo", 1);
        Integer pageSize = getIntegerParameter("pageSize", 10);
        int limit = pageSize.intValue();
        int offset = (pageNo - 1) * limit;
        Map param = new HashMap();
        param.put("offset", offset);
        param.put("limit", limit);
        param.put("userId", uid);
        param.put("type", type);
        List<GoodsCollectEntity> collectEntities = collectService.queryListbyUid(param);
        R r = R.ok();
        r.put("data", collectEntities);
        return r;
    }
}
