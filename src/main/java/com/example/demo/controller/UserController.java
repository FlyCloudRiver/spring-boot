package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    @GetMapping(value = "")
    public String index() {
        return "login"; // 此处表示返回值是一个值为“login”的String。不指向界面的原因是类的注解是@RestController
    }


    /*指向页面的写法*/
    @GetMapping(value = "index.do")
    public ModelAndView index2() {
        return new ModelAndView("login"); // 此处指向界面
    }

    /*登录*/
    @GetMapping(value = "login.do")
    public Object login(String name, String password) {
        System.out.println("传入参数：name=" + name + ", password=" + password);
        if (name.isEmpty()) {
            return "name不能为空";
        } else if (password.isEmpty()) {
            return "password不能为空";
        }
        User user = userService.find(name, password);
        if (user != null) {
            return user;
        } else {
            return "用户名或密码错误";
        }


}
    /*测试*/
    @RequestMapping("/cs")
    public User cs() {
        //调用service层
        User user = userService.selectUserById(17);
        System.out.println(user);
        return user;
    }



}
