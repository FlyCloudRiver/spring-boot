package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//证明是controller层并且返回json
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。则Controller中的方法无法返回jsp页面或者html页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容。

//例如：本来应该到index.html页面的，则其显示index。
@RestController
@Api(description = "POST接口" )   //swagger
@RequestMapping("/user")
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

   /* *//*登录*//*
    @ApiOperation(value = "登录")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(String name, String password) {
        System.out.println("传入参数：name=" + name + ", password=" + password);
        User user = userService.login(name, password);
        System.out.println(user);
        return user;
    }*/

    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public List<User> getList() {
        List<User> list = userService.findALl();
        return list;
    }

    @ApiOperation(value = "根据ID查询用户")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public User selectUserById(Integer userId) {
        //调用service层
        User user = userService.selectUserById(userId);
        System.out.println(user);
        return user;
    }

    @ApiOperation(value = "根据姓名查询用户")
    @RequestMapping(value = "/userlist", method = RequestMethod.POST)
    public List<User> selectUserByName(String userName) {
        //调用service层
        List<User> list = userService.selectUserByName(userName);
        System.out.println(list);
        return list;
    }

    /* 指向页面的写法*//*
    @GetMapping(value = "index.do")
    public ModelAndView index2() {
        return new ModelAndView("login"); // 此处指向界面
    }*/
    @ApiOperation(value = "登录")
    @PostMapping("/login")//@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
    public User loginUser(User user) {
        System.out.println("后台过来的user:"+user);
        User user2 = userService.login(user.getUserName(), user.getUserPassword());
        System.err.println(user);
        return user2;

    }
}



