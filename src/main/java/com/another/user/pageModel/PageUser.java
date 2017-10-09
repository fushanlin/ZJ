package com.another.user.pageModel;

import com.another.base.entity.PageModel;

/**
 * Created by wk on 2016/3/16.
 */
public class PageUser extends PageModel {

    private String phone;   //手机号
    private String username;
    private String password;
    private Integer userType;   //用户类型   1：货主  | 2 ：司机

    private Integer state;              //状态

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

}
