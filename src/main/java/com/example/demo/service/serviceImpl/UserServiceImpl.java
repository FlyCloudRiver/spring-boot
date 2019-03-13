package com.example.demo.service.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //依赖注入
    @Autowired
    private UserMapper userMapper;
    /*根据ID查询用户*/
    @Override
    public User selectUserById(Integer userId) {
        User user = userMapper.selectUserById(userId);
        return user;
    }

    /*登录*/
    @Override
    public User login(String name, String password) {
        return userMapper.login(name,password);
    }

    @Override
    public List<User> findALl() {
        return userMapper.findAll();
    }

    /*根据姓名查询用户（模糊查询）*/
    @Override
    public List<User> selectUserByName(String userName) {
        userName="%"+userName+"%";
        return userMapper.selectUserByName(userName);
    }

    /*修改用户信息*/
    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    /*添加用户*/
    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    /*删除用户*/
    @Override
    public Integer deletUser(Integer userId) {
        return userMapper.deletUser(userId);
    }
}
