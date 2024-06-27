package com.example.controller;

import com.example.Service.userService;
import com.example.pojo.Result;
import com.example.pojo.shoucangjia;
import com.example.pojo.user;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @PostMapping
    public Result addUser(@RequestBody user user){
        log.info("注册用户,user:{}",user);
        userService.addUser(user);
        return Result.success();
    }

    @PostMapping("/chaxun")
    public Result chaxunuser(@RequestBody user user){
        log.info("查询用户,user:{}",user);
        user u = userService.login(user);
        return u != null ? Result.success() : Result.error("用户名或密码错误");
    }

    @GetMapping
    public Result getUser(){
        List<user> users = userService.getUser();
        return Result.success(users);
    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable  Integer id){
        userService.deleteUser(id);
        return Result.success();
    }

    //修改用户信息
    @PutMapping
    public Result updateUser(@RequestBody user user){
        userService.updateUser(user);
        return Result.success();
    }
}
