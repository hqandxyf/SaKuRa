package com.example.Service;

import com.example.pojo.user;

import java.util.List;

public interface userService {
    //新增用户
    void addUser(user user);


    //用户登录(查询用户账号)
    user login(user user);

    //查询所有用户
    List<user> getUser();

    void deleteUser(Integer id);

    void updateUser(user user);
}
