package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class User implements Serializable {
    @ApiModelProperty(value = "用户ID",example = "1")
    private Integer userId;
    @ApiModelProperty(value = "用户名字",example = "小明")
    private String userName;
    @ApiModelProperty(value = "用户年龄",example = "18")
    private Integer userAge;
    @ApiModelProperty(value = "用户密码",example = "123456")
    private String userPassword;

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

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + ", userAge=" + userAge + ", userPassword='" + userPassword + '\'' + '}';
    }
}
