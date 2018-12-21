package com.sp.mapper;

import com.sp.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.zousp.cn
 * @Date: 2018/12/19
 * @Description: com.sp.mapper
 * @version: 1.0
 */
public interface UserMapper {

    void insertUser(Users users);
    List<Users> selectUserAll();


}
