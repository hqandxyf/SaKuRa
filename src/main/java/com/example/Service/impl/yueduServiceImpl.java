package com.example.Service.impl;

import com.example.Service.shoucangjiaService;
import com.example.Service.yueduService;
import com.example.mapper.shoucangjiaMapper;
import com.example.mapper.yueduMapper;
import com.example.pojo.shoucangjia;
import com.example.pojo.yuedu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class yueduServiceImpl implements yueduService {
    @Autowired
    private yueduMapper ydm;

    @Override
    public List<yuedu> getName() {
        return ydm.getName();
    }

    @Override
    public void add(yuedu luyd) {
        ydm.add(luyd);
    }

    @Override
    public void delect(Integer id) {
        ydm.delect(id);
    }

    @Override
    public void update(yuedu ryd) {
        ydm.update(ryd);
    }
}
