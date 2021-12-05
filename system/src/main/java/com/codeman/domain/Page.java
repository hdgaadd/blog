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
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义页面ID
     */
    @TableId(value = "page_id", type = IdType.AUTO)
    private Integer pageId;

    /**
     * key
     */
    private String pageKey;

    /**
     * 标题
     */
    private String pageTitle;

    /**
     * 内容
     */
    private String pageContent;

    /**
     * 创建时间
     */
    private LocalDateTime pageCreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime pageUpdateTime;

    /**
     * 访问量
     */
    private Integer pageViewCount;

    /**
     * 评论数
     */
    private Integer pageCommentCount;

    /**
     * 状态
     */
    private Integer pageStatus;


    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageKey() {
        return pageKey;
    }

    public void setPageKey(String pageKey) {
        this.pageKey = pageKey;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    public LocalDateTime getPageCreateTime() {
        return pageCreateTime;
    }

    public void setPageCreateTime(LocalDateTime pageCreateTime) {
        this.pageCreateTime = pageCreateTime;
    }

    public LocalDateTime getPageUpdateTime() {
        return pageUpdateTime;
    }

    public void setPageUpdateTime(LocalDateTime pageUpdateTime) {
        this.pageUpdateTime = pageUpdateTime;
    }

    public Integer getPageViewCount() {
        return pageViewCount;
    }

    public void setPageViewCount(Integer pageViewCount) {
        this.pageViewCount = pageViewCount;
    }

    public Integer getPageCommentCount() {
        return pageCommentCount;
    }

    public void setPageCommentCount(Integer pageCommentCount) {
        this.pageCommentCount = pageCommentCount;
    }

    public Integer getPageStatus() {
        return pageStatus;
    }

    public void setPageStatus(Integer pageStatus) {
        this.pageStatus = pageStatus;
    }

    @Override
    public String toString() {
        return "Page{" +
        "pageId=" + pageId +
        ", pageKey=" + pageKey +
        ", pageTitle=" + pageTitle +
        ", pageContent=" + pageContent +
        ", pageCreateTime=" + pageCreateTime +
        ", pageUpdateTime=" + pageUpdateTime +
        ", pageViewCount=" + pageViewCount +
        ", pageCommentCount=" + pageCommentCount +
        ", pageStatus=" + pageStatus +
        "}";
    }
}
