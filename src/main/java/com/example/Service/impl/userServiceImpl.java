package com.example.Service.impl;

import com.example.Service.userService;
import com.example.mapper.userMapper;
import com.example.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userMapper userMapper;

    @Override
    public void addUser(user user) {
        userMapper.insert(user);
    }

    @Override
    public user login(user user) {
        return userMapper.getByUsernameAndPassword(user);
    }

    @Override
    public List<user> getUser() {
        return userMapper.getUser();
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(user user) {
        userMapper.updateUser(user);
    }
}
