package com.example.mybatis_plus_datasource.Service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis_plus_datasource.Service.UserService;
import com.example.mybatis_plus_datasource.mapper.UserMapper;
import com.example.mybatis_plus_datasource.pojo.User;
import org.springframework.stereotype.Service;

@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService  {
}
