package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer user_id;
    private String user_name;
    private Integer user_age;
    private String user_password;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", user_name='" + user_name + '\'' + ", user_age=" + user_age + ", user_password=" + user_password + '}';
    }
}