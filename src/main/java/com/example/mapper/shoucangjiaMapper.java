package com.example.mapper;

import com.example.pojo.shoucangjia;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface shoucangjiaMapper {
    @Select("select * from shoucangjia")
    List<shoucangjia> getName();

    @Insert("insert into shoucangjia(id, shoucangjianame, danciming, zhongwenshiyi)"+
            "values (#{id},#{shoucangjianame},#{danciming},#{zhongwenshiyi})")
    void add(shoucangjia luscj);

    @Delete("delete from shoucangjia where id = #{id}")
    void delect(Integer id);

    void update(shoucangjia rscj);
}
