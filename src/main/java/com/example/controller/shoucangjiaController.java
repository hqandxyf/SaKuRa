package com.example.controller;

import com.example.Service.danciService;
import com.example.Service.shoucangjiaService;
import com.example.pojo.Result;
import com.example.pojo.danci;
import com.example.pojo.shoucangjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shoucangjia")
public class shoucangjiaController {
    @Autowired
    private shoucangjiaService scj;

    //查询所有收藏夹
    @GetMapping
    public Result getName(){
        List<shoucangjia> shoucangjiaList =  scj.getName();
        return Result.success(shoucangjiaList);
    }

    //新增收藏夹
    @PostMapping
    public Result add(@RequestBody shoucangjia luscj) {
        scj.add(luscj);
        return Result.success();
    }

    //删除收藏夹
    @DeleteMapping("/{id}")//注解为绑定路径参数作用---批量删除（可单个删除）
    public Result delect(@PathVariable Integer id) {
        scj.delect(id);
        return Result.success();
    }

    //修改收藏夹
    @PutMapping
    public Result update(@RequestBody shoucangjia rscj){
        scj.update(rscj);
        return Result.success();
    }
}
