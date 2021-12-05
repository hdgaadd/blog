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
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文章ID
     */
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    /**
     * 用户ID
     */
    private Integer articleUserId;

    /**
     * 标题
     */
    private String articleTitle;

    /**
     * 内容
     */
    private String articleContent;

    /**
     * 访问量
     */
    private Integer articleViewCount;

    /**
     * 评论数
     */
    private Integer articleCommentCount;

    /**
     * 点赞数
     */
    private Integer articleLikeCount;

    /**
     * 是否允许评论
     */
    private Integer articleIsComment;

    /**
     * 状态
     */
    private Integer articleStatus;

    /**
     * 排序值
     */
    private Integer articleOrder;

    /**
     * 更新时间
     */
    private LocalDateTime articleUpdateTime;

    /**
     * 创建时间
     */
    private LocalDateTime articleCreateTime;

    /**
     * 摘要
     */
    private String articleSummary;

    /**
     * 缩略图
     */
    private String articleThumbnail;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getArticleUserId() {
        return articleUserId;
    }

    public void setArticleUserId(Integer articleUserId) {
        this.articleUserId = articleUserId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Integer getArticleIsComment() {
        return articleIsComment;
    }

    public void setArticleIsComment(Integer articleIsComment) {
        this.articleIsComment = articleIsComment;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Integer getArticleOrder() {
        return articleOrder;
    }

    public void setArticleOrder(Integer articleOrder) {
        this.articleOrder = articleOrder;
    }

    public LocalDateTime getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(LocalDateTime articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public LocalDateTime getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(LocalDateTime articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public String getArticleThumbnail() {
        return articleThumbnail;
    }

    public void setArticleThumbnail(String articleThumbnail) {
        this.articleThumbnail = articleThumbnail;
    }

    @Override
    public String toString() {
        return "Article{" +
        "articleId=" + articleId +
        ", articleUserId=" + articleUserId +
        ", articleTitle=" + articleTitle +
        ", articleContent=" + articleContent +
        ", articleViewCount=" + articleViewCount +
        ", articleCommentCount=" + articleCommentCount +
        ", articleLikeCount=" + articleLikeCount +
        ", articleIsComment=" + articleIsComment +
        ", articleStatus=" + articleStatus +
        ", articleOrder=" + articleOrder +
        ", articleUpdateTime=" + articleUpdateTime +
        ", articleCreateTime=" + articleCreateTime +
        ", articleSummary=" + articleSummary +
        ", articleThumbnail=" + articleThumbnail +
        "}";
    }
}
