package com.example.demo.controller;

import com.example.demo.entity.Administrator;
import com.example.demo.service.AdministratorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Author: 江云飞
 * Date:   2019/3/25
 */

@RestController
@Api(description = "管理员" )   //swagger
@RequestMapping("/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @ApiOperation(value = "添加")
    @RequestMapping(value = "/addAdministrator", method = RequestMethod.POST)
    public Integer addAdministrator(Administrator administrator){

       /* Date time= new java.sql.Date(new java.util.Date().getTime());
        administrator.setCreateTime(time);*/
        return administratorService.addAdministrator(administrator);
    }
}
