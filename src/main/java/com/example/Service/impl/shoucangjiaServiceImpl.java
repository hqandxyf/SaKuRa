package com.example.Service.impl;

import com.example.Service.shoucangjiaService;
import com.example.mapper.shoucangjiaMapper;
import com.example.pojo.shoucangjia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shoucangjiaServiceImpl implements shoucangjiaService {
    @Autowired
    private shoucangjiaMapper scjm;

    @Override
    public List<shoucangjia> getName() {
        return scjm.getName();
    }

    @Override
    public void add(shoucangjia luscj) {
        scjm.add(luscj);
    }

    @Override
    public void delect(Integer id) {
        scjm.delect(id);
    }

    @Override
    public void update(shoucangjia rscj) {
        scjm.update(rscj);
    }
}
