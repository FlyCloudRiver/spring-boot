package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    /*根据ID查询用户*/
    User selectUserById(Integer userId);

    /*登录*/
    User login(String name, String password);

    /*获取所有用户*/
    List<User> findALl();

    /*根据姓名查询用户（模糊查询）*/
    List<User> selectUserByName(String userName);
}
