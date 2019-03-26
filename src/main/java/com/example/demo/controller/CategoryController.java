package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */

@RestController
@Api(description = "商品类别" )   //swagger
@RequestMapping("/category")
public class CategoryController {

}
