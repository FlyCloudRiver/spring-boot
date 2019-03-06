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
/*测试*/
    @Override
    public User selectUserById(Integer userId) {
        User user = userMapper.selectUserById(17);
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
}
