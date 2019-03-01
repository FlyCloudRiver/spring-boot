package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//证明是controller层并且返回json
//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。则Controller中的方法无法返回jsp页面或者html页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容。

//例如：本来应该到index.html页面的，则其显示index。
@RestController
public class UserController {
    //依赖注入
    @Autowired
    private UserService userService;

    /*@RequestMapping(value = "cs")*/
    /*用来处理请求地址映射的注解*/
    
    @RequestMapping("/cs")
    public User cs() {
        //调用service层
        User user = userService.selectUserById(17);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/css")
    public String css(){
        return "redirect:result.html";
    }

}
