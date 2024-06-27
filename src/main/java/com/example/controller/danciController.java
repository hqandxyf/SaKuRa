package com.example.controller;

import com.example.Service.danciService;
import com.example.pojo.Result;
import com.example.pojo.danci;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("danci")
public class danciController {

    @Autowired
    private danciService danciService;

    @GetMapping("/listall")
    public Result listAll(){
        List<danci> dc = danciService.listAll();
        return Result.success(dc);
    }

    @GetMapping //模糊查询
    public Result list(String zhongwen, String riwen) {
        //调用service查询单词数据
        ArrayList<danci> dc = danciService.list(zhongwen, riwen);
        return Result.success(dc);
    }

    @DeleteMapping("/{id}")//注解为绑定路径参数作用---批量删除（可单个删除）
    public Result delect(@PathVariable Integer id) {
        //删除单词
        danciService.delect(id);
        return Result.success();
    }

    //接受json格式数据，由前端from表单传递，使用@RequestBody把传递过来的数据封装到实体类中
    @PostMapping
    public Result add(@RequestBody danci dc) {
        log.info("新增单词：{}", dc);
        danciService.add(dc);
        return Result.success();
    }

    @GetMapping("/{id}")//根据id查询单词（回显数据）
    public Result getById(@PathVariable Integer id){
        danci danci = danciService.getById(id);
        return Result.success(danci);
    }

    @PutMapping//更新单词信息
    public Result update(@RequestBody danci dc){
        danciService.update(dc);
        return Result.success();
    }
}
