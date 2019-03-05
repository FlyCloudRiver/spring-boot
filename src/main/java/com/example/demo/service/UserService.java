package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    /*测试*/
    User selectUserById(Integer userId);

    /*登录*/
    User find(String name, String password);
}
