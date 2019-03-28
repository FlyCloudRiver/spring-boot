package com.example.demo.service;

import com.example.demo.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */
public interface CategoryService {

    Integer insertCategory(String categoryName);

    Integer deletCategory(Integer id);

    Integer updateCategory(@Param("id")Integer id, @Param("categoryName")String categoryName);

    List<Category> selectCateGory(String categoryName);
}
