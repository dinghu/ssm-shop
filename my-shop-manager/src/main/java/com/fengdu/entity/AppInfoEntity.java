package com.fengdu.entity;

import java.io.Serializable;
import java.util.Date;

public class AppInfoEntity implements Serializable {
    private Integer id;

    private String version;

    private String content;

    private String downloadUrl;

    private Byte forceUpdate;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Byte getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Byte forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}