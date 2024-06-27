package com.example.controller;

import com.example.Service.userService;
import com.example.pojo.Result;
import com.example.pojo.user;
import com.example.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class loginController {
    @Autowired
    private userService userService;

    @PostMapping("/login")
    public Result login(@RequestBody user user) {
        user u = userService.login(user);

        //登录成功,生成令牌,下发令牌
        if (u != null) {
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", u.getId());
            claims.put("username", u.getUsername());

            String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的用户信息
            return Result.success(jwt);
        }

        return u != null ? Result.success() : Result.error("用户名或密码错误");
    }

}
