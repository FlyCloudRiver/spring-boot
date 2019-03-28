package com.example.demo.mapper;

import com.example.demo.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: 江云飞
 * Date:   2019/3/26
 */

@Repository
@Mapper
public interface CategoryMapper {

    Integer insertCategory(String categoryName);

    Integer deletCategory(Integer id);

    Integer updateCategory(@Param("id")Integer id,@Param("categoryName")String categoryName);

    List<Category> selectCateGory(@Param("categoryName")String categoryName);
}
