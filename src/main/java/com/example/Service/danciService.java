package com.example.Service;

import com.example.pojo.danci;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


public interface danciService {

    //查询单词
    ArrayList<danci> list(@Param("zhongwen") String zhongwen, @Param("riwen") String riwen);

    //分页查询
    /*List<danci> findByPage(Integer start, Integer rows);*/

    //删除单词
    void delect(Integer id);

    //新增
    void add(danci dc);

    //根据id查询单词
    danci getById(Integer id);

    //更新单词
    void update(danci dc);

    List<danci> listAll();
}
