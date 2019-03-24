package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "用户ID",example = "1")
    private Integer id;

    @ApiModelProperty(value = "用户名字",example = "小明")
    @Column(name = "user_name")//可写可不写  后面mybatis有
    private String userName;
    @ApiModelProperty(value = "用户年龄",example = "18")

    @Column(name = "user_Age")
    private Integer userAge;
    @ApiModelProperty(value = "用户密码",example = "123456")

    @Column(name = "user_password")
    private String userPassword;

    public Integer getUserId() {
        return id;
    }

    public void setUserId(Integer userId) {
        this.id = userId;
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
        return "User{" + "userId=" + id + ", userName='" + userName + '\'' + ", userAge=" + userAge + ", userPassword='" + userPassword + '\'' + '}';
    }
}
