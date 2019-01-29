package com.fengdu.api;

import com.fengdu.annotation.IgnoreAuth;
import com.fengdu.cache.RegionCacheUtil;
import com.fengdu.entity.RegionVo;
import com.fengdu.entity.SysRegionEntity;
import com.fengdu.util.ApiBaseAction;
import com.fengdu.utils.StringUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/region")
@Api(value = "省市区模块接口->api", tags = { "省市区接口Controller" })
public class ApiRegionController extends ApiBaseAction {

    @IgnoreAuth
    @RequestMapping("list")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public Object list(Integer parentId) {
        List<SysRegionEntity> regionEntityList = RegionCacheUtil.getChildrenByParentId(parentId);
        List<RegionVo> regionVoList = new ArrayList();
        if (null != regionEntityList && regionEntityList.size() > 0) {
            for (SysRegionEntity sysRegionEntity : regionEntityList) {
                regionVoList.add(new RegionVo(sysRegionEntity));
            }
        }
        return toResponsSuccess(regionVoList);
    }

    @IgnoreAuth
    @RequestMapping("provinceList")
    @ApiOperation(value = "发表评论接口",response=Map.class, notes ="发表评论接口")
    public Object provinceList() {
        List<SysRegionEntity> regionEntityList = RegionCacheUtil.getAllProvice();
        List<RegionVo> regionVoList = new ArrayList();
        if (null != regionEntityList && regionEntityList.size() > 0) {
            for (SysRegionEntity sysRegionEntity : regionEntityList) {
                regionVoList.add(new RegionVo(sysRegionEntity));
            }
        }
        return toResponsSuccess(regionVoList);
    }

    @IgnoreAuth
    @RequestMapping("cityList")
    public Object provinceList(String proviceName) {
        List<SysRegionEntity> regionEntityList = RegionCacheUtil.getChildrenCity(proviceName);
        List<RegionVo> regionVoList = new ArrayList();
        if (null != regionEntityList && regionEntityList.size() > 0) {
            for (SysRegionEntity sysRegionEntity : regionEntityList) {
                regionVoList.add(new RegionVo(sysRegionEntity));
            }
        }
        return toResponsSuccess(regionVoList);
    }

    @IgnoreAuth
    @RequestMapping("distinctList")
    public Object distinctList(String proviceName, String cityName) {
        List<SysRegionEntity> regionEntityList = RegionCacheUtil.getChildrenDistrict(proviceName, cityName);
        List<RegionVo> regionVoList = new ArrayList();
        if (null != regionEntityList && regionEntityList.size() > 0) {
            for (SysRegionEntity sysRegionEntity : regionEntityList) {
                regionVoList.add(new RegionVo(sysRegionEntity));
            }
        }
        return toResponsSuccess(regionVoList);
    }

    @IgnoreAuth
    @RequestMapping("info")
    public Object info(Integer regionId) {
        SysRegionEntity regionEntity = RegionCacheUtil.getAreaByAreaId(regionId);
        return toResponsSuccess(new RegionVo(regionEntity));
    }

    @IgnoreAuth
    @RequestMapping("regionIdsByNames")
    public Object regionIdsByNames(String provinceName, String cityName, String districtName) {
        Map resultObj = new HashMap();
        Integer provinceId = 0;
        Integer cityId = 0;
        Integer districtId = 0;
        if (null != provinceName) {
            provinceId = RegionCacheUtil.getProvinceIdByName(provinceName);
        }
        if (null != provinceId && !StringUtils.isNullOrEmpty(cityName)) {
            cityId = RegionCacheUtil.getCityIdByName(provinceId, cityName);
        }
        if (null != provinceId && null != cityId && !StringUtils.isNullOrEmpty(districtName)) {
            districtId = RegionCacheUtil.getDistrictIdByName(provinceId, cityId, districtName);
        }
        resultObj.put("provinceId", provinceId);
        resultObj.put("cityId", cityId);
        resultObj.put("districtId", districtId);
        return toResponsSuccess(resultObj);
    }
}