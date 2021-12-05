package com.codeman.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-04
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 链接ID
     */
    @TableId(value = "link_id", type = IdType.AUTO)
    private Integer linkId;

    /**
     * URL
     */
    private String linkUrl;

    /**
     * 姓名
     */
    private String linkName;

    /**
     * 头像
     */
    private String linkImage;

    /**
     * 描述
     */
    private String linkDescription;

    /**
     * 所属人名称
     */
    private String linkOwnerNickname;

    /**
     * 联系方式
     */
    private String linkOwnerContact;

    /**
     * 更新时间
     */
    private LocalDateTime linkUpdateTime;

    /**
     * 创建时间
     */
    private LocalDateTime linkCreateTime;

    /**
     * 排序号
     */
    private Integer linkOrder;

    /**
     * 状态
     */
    private Integer linkStatus;


    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public String getLinkDescription() {
        return linkDescription;
    }

    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    public String getLinkOwnerNickname() {
        return linkOwnerNickname;
    }

    public void setLinkOwnerNickname(String linkOwnerNickname) {
        this.linkOwnerNickname = linkOwnerNickname;
    }

    public String getLinkOwnerContact() {
        return linkOwnerContact;
    }

    public void setLinkOwnerContact(String linkOwnerContact) {
        this.linkOwnerContact = linkOwnerContact;
    }

    public LocalDateTime getLinkUpdateTime() {
        return linkUpdateTime;
    }

    public void setLinkUpdateTime(LocalDateTime linkUpdateTime) {
        this.linkUpdateTime = linkUpdateTime;
    }

    public LocalDateTime getLinkCreateTime() {
        return linkCreateTime;
    }

    public void setLinkCreateTime(LocalDateTime linkCreateTime) {
        this.linkCreateTime = linkCreateTime;
    }

    public Integer getLinkOrder() {
        return linkOrder;
    }

    public void setLinkOrder(Integer linkOrder) {
        this.linkOrder = linkOrder;
    }

    public Integer getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(Integer linkStatus) {
        this.linkStatus = linkStatus;
    }

    @Override
    public String toString() {
        return "Link{" +
        "linkId=" + linkId +
        ", linkUrl=" + linkUrl +
        ", linkName=" + linkName +
        ", linkImage=" + linkImage +
        ", linkDescription=" + linkDescription +
        ", linkOwnerNickname=" + linkOwnerNickname +
        ", linkOwnerContact=" + linkOwnerContact +
        ", linkUpdateTime=" + linkUpdateTime +
        ", linkCreateTime=" + linkCreateTime +
        ", linkOrder=" + linkOrder +
        ", linkStatus=" + linkStatus +
        "}";
    }
}
