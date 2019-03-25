package com.example.demo.service.serviceImpl;


import com.example.demo.entity.Administrator;
import com.example.demo.mapper.AdministratorMapper;
import com.example.demo.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: 江云飞
 * Date:   2019/3/25
 */

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorMapper administratorMapper;
    @Override
    public Integer addAdministrator(Administrator administrator) {

        return administratorMapper.addAdministrator(administrator);
    }
}
