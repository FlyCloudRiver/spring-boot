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
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//证明是controller层并且返回json
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。则Controller中的方法无法返回jsp页面或者html页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容。

//例如：本来应该到index.html页面的，则其显示index。
@RestController
@Api(description = "POST接口" )   //swagger
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;


    /*登录*/
    @ApiOperation(value = "登录")
    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public Object login(String name, String password) {
        System.out.println("传入参数：name=" + name + ", password=" + password);
        User user = userService.login(name, password);
        System.out.println(user);
        return user;
    }

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


    /* 指向页面的写法*//*
    @GetMapping(value = "index.do")
    public ModelAndView index2() {
        return new ModelAndView("login"); // 此处指向界面
    }*/
}



