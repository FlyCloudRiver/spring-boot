package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    /*根据ID查询用户*/
    User selectUserById(Integer userId);

    /*登录*/
    User login(String name, String password);


    /*根据姓名查询用户（模糊查询）*/
    List<User> selectUserByName(String userName);

    /*修改用户信息*/
    Integer updateUser(User user);

    /*添加用户*/
    Integer addUser(User user);

    /*删除用户*/
    Integer deletUser(Integer userId);


}
