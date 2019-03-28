package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */

@RestController
@Api(description = "商品类别" )   //swagger
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "添加分类")
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public Integer insertCategory(String categoryName){
        return  categoryService.insertCategory(categoryName);
    }

    @ApiOperation(value = "删除分类")
    @RequestMapping(value = "/delet", method = RequestMethod.POST)
    public Integer deletCategory(Integer id){
        return categoryService.deletCategory(id);
    }

    @ApiOperation(value = "修改分类")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Integer updateCategory(Integer id,String categoryName){
        return categoryService.updateCategory(id,categoryName);
    }

    @ApiOperation(value = "查询分类")
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    List<Category> selectCateGory(String categoryName){
        return  categoryService.selectCateGory(categoryName);
    }

}
