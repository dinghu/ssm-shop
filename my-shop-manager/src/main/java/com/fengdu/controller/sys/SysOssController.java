package com.fengdu.controller.sys;

import com.alibaba.fastjson.JSON;
import com.fengdu.entity.SysOssEntity;
import com.fengdu.oss.CloudStorageConfig;
import com.fengdu.oss.LocalStorageService;
import com.fengdu.oss.OSSFactory;
import com.fengdu.service.SysConfigService;
import com.fengdu.service.SysOssService;
import com.fengdu.utils.*;
import com.fengdu.validator.ValidatorUtils;
import com.fengdu.validator.group.AliyunGroup;
import com.fengdu.validator.group.QcloudGroup;
import com.fengdu.validator.group.QiniuGroup;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 文件上传
 *
 * @author tiankong
 * @email 2366207000@qq.com
 * @date 2017-03-25 12:13:26
 */
@RestController
@RequestMapping("sys/oss")
public class SysOssController {
    @Autowired
    private SysOssService sysOssService;
    @Autowired
    private SysConfigService sysConfigService;

    private final static String KEY = ConfigConstant.CLOUD_STORAGE_CONFIG_KEY;

    private final static boolean isUseCloud = false;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:oss:all")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<SysOssEntity> sysOssList = sysOssService.queryList(query);
        int total = sysOssService.queryTotal(query);
        PageUtils pageUtil = new PageUtils(sysOssList, total, query.getLimit(), query.getPage());
        return R.ok().put("page", pageUtil);
    }


    /**
     * 云存储配置信息
     */
    @RequestMapping("/config")
    @RequiresPermissions("sys:oss:all")
    public R config() {
        CloudStorageConfig config = sysConfigService.getConfigObject(KEY, CloudStorageConfig.class);
        return R.ok().put("config", config);
    }


    /**
     * 保存云存储配置信息
     */
    @RequestMapping("/saveConfig")
    @RequiresPermissions("sys:oss:all")
    public R saveConfig(@RequestBody CloudStorageConfig config) {
        //校验类型
        ValidatorUtils.validateEntity(config);
        if (config.getType() == Constant.CloudService.QINIU.getValue()) {
            //校验七牛数据
            ValidatorUtils.validateEntity(config, QiniuGroup.class);
        } else if (config.getType() == Constant.CloudService.ALIYUN.getValue()) {
            //校验阿里云数据
            ValidatorUtils.validateEntity(config, AliyunGroup.class);
        } else if (config.getType() == Constant.CloudService.QCLOUD.getValue()) {
            //校验腾讯云数据
            ValidatorUtils.validateEntity(config, QcloudGroup.class);
        }
        sysConfigService.updateValueByKey(KEY, JSON.toJSONString(config));
        return R.ok();
    }


    /**
     * 上传文件
     */
    @RequestMapping("/upload")
    @RequiresPermissions("sys:oss:all")
    public R upload(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new RRException("上传文件不能为空");
        }
        String url;
        //上传文件
        if (isUseCloud) {
            url = OSSFactory.build().upload(file);
        } else {
            url = LocalStorageService.upload(request, file);
        }
        //保存文件信息
        SysOssEntity ossEntity = new SysOssEntity();
        ossEntity.setUrl(url);
        ossEntity.setCreateDate(new Date());
        sysOssService.save(ossEntity);
        R r = new R();
        r.put("url", url);
        r.put("link", url);
        return r;
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:oss:all")
    public R delete(@RequestBody Long[] ids) {
        sysOssService.deleteBatch(ids);
        return R.ok();
    }

    /**
     * 查询所有列表
     */
    @RequestMapping("/queryAll")
    public List<String> queryAll(@RequestParam Map<String, Object> params) {
        //查询列表数据
        List<SysOssEntity> sysOssList = sysOssService.queryList(params);
        List<String> list = new ArrayList<>();
        if (null != sysOssList && sysOssList.size() > 0) {
            for (SysOssEntity item : sysOssList) {
                list.add(item.getUrl());
            }
        }
        return list;
    }
}
