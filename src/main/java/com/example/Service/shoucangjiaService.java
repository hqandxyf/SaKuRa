package com.example.Service;

import com.example.pojo.shoucangjia;

import java.util.List;

public interface shoucangjiaService {
    //查询所有收藏夹
    List<shoucangjia> getName();

    //新增收藏夹
    void add(shoucangjia luscj);

    //删除收藏夹
    void delect(Integer id);

    //修改收藏夹
    void update(shoucangjia rscj);
}
