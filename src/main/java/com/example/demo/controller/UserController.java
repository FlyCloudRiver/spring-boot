package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//证明是controller层并且返回json
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。则Controller中的方法无法返回jsp页面或者html页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容。

//例如：本来应该到index.html页面的，则其显示index。
@RestController
@Api(description = "用户控制接口" )   //swagger
@RequestMapping("/user")
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取所有用户")
    @RequestMapping(value = "/selectAllUser", method = RequestMethod.GET)
    public List<User> getList(Integer pageSize,Integer pageNumber) {
        int a=pageSize*(pageNumber-1);
        int b=pageSize;
        List<User> list = userService.findALl(pageSize,pageNumber);
        return list;
    }

    @ApiOperation(value = "根据ID查询用户")
    @RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
    public User selectUserById(Integer userId) {
        //调用service层
        User user = userService.selectUserById(userId);
        return user;
    }

    @ApiOperation(value = "根据姓名查询用户")
    @RequestMapping(value = "/selectUserByName", method = RequestMethod.POST)
    public List<User> selectUserByName(String userName) {
        //调用service层
        List<User> list = userService.selectUserByName(userName);
        System.out.println(list);
        return list;
    }

    @ApiOperation(value = "登录")
    @PostMapping("/login")//@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
    public User loginUser(String userName, String userPassword) {

        User user2 = userService.login(userName,userPassword);
        return user2;

    }

    @ApiOperation(value = "修改用户信息")
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public Integer updateUser(User user) {
        //调用service层
        return userService.updateUser(user);
    }

    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Integer addUser(User user) {
        //调用service层
        return userService.addUser(user);
    }

    @ApiOperation(value = "删除用户")
    @RequestMapping(value = "/deletUser", method = RequestMethod.GET)
    public Integer deletUser(Integer userId) {
        //调用service层
        return userService.deletUser(userId);
    }

}



