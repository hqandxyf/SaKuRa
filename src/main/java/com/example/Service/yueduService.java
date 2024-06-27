package com.example.Service;

import com.example.pojo.shoucangjia;
import com.example.pojo.yuedu;

import java.util.List;

public interface yueduService {
    //查询所有收藏夹
    List<yuedu> getName();

    //新增收藏夹
    void add(yuedu luyd);

    //删除收藏夹
    void delect(Integer id);

    //修改收藏夹
    void update(yuedu ryd);
}
