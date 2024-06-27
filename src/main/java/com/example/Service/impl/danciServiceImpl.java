package com.example.Service.impl;

import com.example.Service.danciService;
import com.example.mapper.danciMapper;

import com.example.pojo.danci;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class danciServiceImpl implements danciService {

    @Autowired
    private danciMapper danciMapper;


    @Override
    public ArrayList<danci> list(String zhongwen, String riwen) {
        return danciMapper.list(zhongwen,riwen);
    }

    @Override
    public void delect(Integer id) {
       danciMapper.delect(id);
    }

    @Override
    public void add(danci dc) {//需要补全属性，有些不用，看数据库表结构补全
        danciMapper.insert(dc);
    }

    @Override
    public danci getById(Integer id) {
        return danciMapper.getById(id);
    }

    @Override
    public void update(danci dc) {//注意是否需要添加额外信息
        danciMapper.update(dc);
    }

    @Override
    public List<danci> listAll() {
        return danciMapper.listAll();
    }
}
