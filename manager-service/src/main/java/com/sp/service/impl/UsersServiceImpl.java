package com.sp.service.impl;

import com.sp.mapper.UserMapper;
import com.sp.pojo.Users;
import com.sp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserMapper userMapper;


    public void addUser(Users users) {
        this.userMapper.insertUser(users);
    }
}
