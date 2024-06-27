package com.example.controller;


import com.example.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class uploadController {

    @PostMapping("/upload")
    public Result upload(String username, MultipartFile touxiang) throws Exception {
        log.info("文件上传：{}",username,touxiang);
        //获取文件原始名
        String filename = touxiang.getOriginalFilename();

        //唯一文件名(uuid)
        int index = filename.lastIndexOf(".");
        String kuozhanm = filename.substring(index);
        String newFileName = UUID.randomUUID().toString()+kuozhanm;

        //将文件存放至指定磁盘目录
        touxiang.transferTo(new File("D:\\Java\\springboot-webproject\\riyu-web" +
                "\\src\\main\\resources\\static" +
                "\\userUplaodFile\\"+newFileName));
        return Result.success();
    }
}
