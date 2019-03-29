package com.example.demo.controller;



import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    /*查询用户列表*/
    @ApiOperation(value = "根据姓名查询用户列表（userName）")
    @RequestMapping(value = "/selectUserList", method = RequestMethod.POST)
    public PageInfo<User> selectUserByName(String userName,Integer pageNum,Integer pageSize) {
        //调用service层
        /*分页*/

        PageHelper.startPage(1,2,"id desc");
        List<User> list = userService.selectUserByName(userName);
        PageInfo<User> info = new PageInfo<>(list);
        /*System.out.println("总条数"+info.getTotal());
        System.out.println("总页数"+info.getPages());
        System.out.println("是否为第一页"+info.isIsFirstPage());*/

        return info;
    }

    @ApiOperation(value = "根据ID查询用户")
    @RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
    public User selectUserById(Integer userId) {
        //调用service层
        User user = userService.selectUserById(userId);
        return user;
    }



    @ApiOperation(value = "登录")
    @PostMapping("/login")//@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。
    public ResponseEntity<User> loginUser(String userName, String userPassword) {

        User user2 = userService.login(userName,userPassword);
        return ResponseEntity.ok(user2);

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



