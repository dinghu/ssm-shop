package com.fengdu.api;

import com.fengdu.annotation.IgnoreAuth;
import com.fengdu.oss.OSSFactory;
import com.fengdu.util.ApiBaseAction;
import com.fengdu.utils.RRException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 作者: @author Harmon <br>
 * 时间: 2017-09-08 13:20<br>
 * 描述: ApiUploadController <br>
 */
@RestController
@RequestMapping("/api/upload")
@Api(value = "上传文件管理模块接口->api", tags = { "上传文件Controller" })
public class ApiUploadController extends ApiBaseAction {

    /**
     * 上传文件
     */
    @IgnoreAuth
    @RequestMapping("/upload")
    @ApiOperation(value = "上传文件接口",response=Map.class, notes ="上传文件接口")
    public Object upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new RRException("上传文件不能为空");
        }
        //上传文件
        String url = OSSFactory.build().upload(file);
        return toResponsSuccess(url);
    }
}