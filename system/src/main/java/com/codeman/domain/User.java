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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 昵称
     */
    private String userNickname;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 个人主页
     */
    private String userUrl;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 上传登录IP
     */
    private String userLastLoginIp;

    /**
     * 注册时间
     */
    private LocalDateTime userRegisterTime;

    /**
     * 上传登录时间
     */
    private LocalDateTime userLastLoginTime;

    /**
     * 状态
     */
    private Integer userStatus;

    /**
     * 角色
     */
    private String userRole;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    public LocalDateTime getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(LocalDateTime userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public LocalDateTime getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(LocalDateTime userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userPass=" + userPass +
        ", userNickname=" + userNickname +
        ", userEmail=" + userEmail +
        ", userUrl=" + userUrl +
        ", userAvatar=" + userAvatar +
        ", userLastLoginIp=" + userLastLoginIp +
        ", userRegisterTime=" + userRegisterTime +
        ", userLastLoginTime=" + userLastLoginTime +
        ", userStatus=" + userStatus +
        ", userRole=" + userRole +
        "}";
    }
}
