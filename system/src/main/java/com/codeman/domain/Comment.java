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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论ID
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 上级评论ID
     */
    private Integer commentPid;

    /**
     * 上级评论名称
     */
    private String commentPname;

    /**
     * 文章ID
     */
    private Integer commentArticleId;

    /**
     * 评论人名称
     */
    private String commentAuthorName;

    /**
     * 评论人邮箱
     */
    private String commentAuthorEmail;

    /**
     * 评论人个人主页
     */
    private String commentAuthorUrl;

    /**
     * 评论人头像
     */
    private String commentAuthorAvatar;

    /**
     * 内容
     */
    private String commentContent;

    /**
     * 浏览器信息
     */
    private String commentAgent;

    /**
     * IP
     */
    private String commentIp;

    /**
     * 评论时间
     */
    private LocalDateTime commentCreateTime;

    /**
     * 角色，是否管理员
     */
    private Integer commentRole;

    /**
     * 评论ID,可能为空
     */
    private Integer commentUserId;


    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentPid() {
        return commentPid;
    }

    public void setCommentPid(Integer commentPid) {
        this.commentPid = commentPid;
    }

    public String getCommentPname() {
        return commentPname;
    }

    public void setCommentPname(String commentPname) {
        this.commentPname = commentPname;
    }

    public Integer getCommentArticleId() {
        return commentArticleId;
    }

    public void setCommentArticleId(Integer commentArticleId) {
        this.commentArticleId = commentArticleId;
    }

    public String getCommentAuthorName() {
        return commentAuthorName;
    }

    public void setCommentAuthorName(String commentAuthorName) {
        this.commentAuthorName = commentAuthorName;
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    public String getCommentAuthorAvatar() {
        return commentAuthorAvatar;
    }

    public void setCommentAuthorAvatar(String commentAuthorAvatar) {
        this.commentAuthorAvatar = commentAuthorAvatar;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentAgent() {
        return commentAgent;
    }

    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent;
    }

    public String getCommentIp() {
        return commentIp;
    }

    public void setCommentIp(String commentIp) {
        this.commentIp = commentIp;
    }

    public LocalDateTime getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(LocalDateTime commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public Integer getCommentRole() {
        return commentRole;
    }

    public void setCommentRole(Integer commentRole) {
        this.commentRole = commentRole;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "commentId=" + commentId +
        ", commentPid=" + commentPid +
        ", commentPname=" + commentPname +
        ", commentArticleId=" + commentArticleId +
        ", commentAuthorName=" + commentAuthorName +
        ", commentAuthorEmail=" + commentAuthorEmail +
        ", commentAuthorUrl=" + commentAuthorUrl +
        ", commentAuthorAvatar=" + commentAuthorAvatar +
        ", commentContent=" + commentContent +
        ", commentAgent=" + commentAgent +
        ", commentIp=" + commentIp +
        ", commentCreateTime=" + commentCreateTime +
        ", commentRole=" + commentRole +
        ", commentUserId=" + commentUserId +
        "}";
    }
}
