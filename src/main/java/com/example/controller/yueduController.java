package com.example.controller;

import com.example.Service.shoucangjiaService;
import com.example.Service.yueduService;
import com.example.pojo.Result;
import com.example.pojo.shoucangjia;
import com.example.pojo.yuedu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("yuedu")
public class yueduController {
    @Autowired
    private yueduService yd;

    //查询所有文章
    @GetMapping
    public Result getName(){
        List<yuedu> ydList =  yd.getName();
        return Result.success(ydList);
    }

    //新增收藏夹
    @PostMapping
    public Result add(@RequestBody yuedu luyd) {
        yd.add(luyd);
        return Result.success();
    }

    //删除收藏夹
    @DeleteMapping("/{id}")//注解为绑定路径参数作用--单个删除
    public Result delect(@PathVariable Integer id) {
        yd.delect(id);
        return Result.success();
    }

    //修改收藏夹
    @PutMapping//根据id修改收藏夹
    public Result update(@RequestBody yuedu ryd){
        yd.update(ryd);
        return Result.success();
    }
}
