package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    /*测试*/
    User selectUserById(Integer userId);

    /*登录 多个参数使用@Param注解*/
    public User login(@Param("name")String name, @Param("password")String password);

   /*List<User> findAll(@Param("start")Integer pageSize,@Param("size")Integer pageNumber);*/

    /*根据姓名查询用户（模糊查询）*/
    List<User> selectUserByName(@Param("userName")String userName,@Param("start")Integer pageSize,@Param("size")Integer pageNumber);

    /*更改用户信息*/
    Integer updateUser(User user);

    /*添加用户*/
    Integer addUser(User user);

    /*删除用户*/
    Integer deletUser(Integer userId);

    Integer selectUserCount();
}
