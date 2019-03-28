package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Category;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public Integer insertCategory(String categoryName) {
        return categoryMapper.insertCategory(categoryName);
    }

    @Override
    public Integer deleteCategory(Integer id) {
        return categoryMapper.deleteCategory(id);
    }

    @Override
    public Integer updateCategory(Integer id, String categoryName) {
        return categoryMapper.updateCategory(id,categoryName);
    }

    @Override
    public List<Category> selectCateGory(String categoryName) {
        return categoryMapper.selectCateGory(categoryName);
    }
}
