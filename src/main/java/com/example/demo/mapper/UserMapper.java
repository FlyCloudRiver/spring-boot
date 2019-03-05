package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /*测试*/
    User selectUserById(Integer userId);

    /*登录 多个参数使用@Param注解*/
    public User find(@Param("name")String name, @Param("password")String password);

}
