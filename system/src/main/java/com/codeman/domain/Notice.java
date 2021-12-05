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
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公告ID
     */
    @TableId(value = "notice_id", type = IdType.AUTO)
    private Integer noticeId;

    /**
     * 公告标题
     */
    private String noticeTitle;

    /**
     * 内容
     */
    private String noticeContent;

    /**
     * 创建时间
     */
    private LocalDateTime noticeCreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime noticeUpdateTime;

    /**
     * 状态
     */
    private Integer noticeStatus;

    /**
     * 排序值
     */
    private Integer noticeOrder;


    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public LocalDateTime getNoticeCreateTime() {
        return noticeCreateTime;
    }

    public void setNoticeCreateTime(LocalDateTime noticeCreateTime) {
        this.noticeCreateTime = noticeCreateTime;
    }

    public LocalDateTime getNoticeUpdateTime() {
        return noticeUpdateTime;
    }

    public void setNoticeUpdateTime(LocalDateTime noticeUpdateTime) {
        this.noticeUpdateTime = noticeUpdateTime;
    }

    public Integer getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(Integer noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getNoticeOrder() {
        return noticeOrder;
    }

    public void setNoticeOrder(Integer noticeOrder) {
        this.noticeOrder = noticeOrder;
    }

    @Override
    public String toString() {
        return "Notice{" +
        "noticeId=" + noticeId +
        ", noticeTitle=" + noticeTitle +
        ", noticeContent=" + noticeContent +
        ", noticeCreateTime=" + noticeCreateTime +
        ", noticeUpdateTime=" + noticeUpdateTime +
        ", noticeStatus=" + noticeStatus +
        ", noticeOrder=" + noticeOrder +
        "}";
    }
}
