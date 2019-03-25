package com.example.demo.mapper;


import com.example.demo.entity.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Author: 江云飞
 * Date:   2019/3/25
 */

@Repository
@Mapper
public interface AdministratorMapper {

    Integer addAdministrator(Administrator administrator);
}
