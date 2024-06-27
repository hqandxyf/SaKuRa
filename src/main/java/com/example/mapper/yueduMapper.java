package com.example.mapper;

import com.example.pojo.yuedu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface yueduMapper {

    @Select("select * from yuedu")
    List<yuedu> getName();

    @Insert("insert into yuedu(id,zhongwen, riwen) VALUES (#{id},#{zhongwen},#{riwen})")
    void add(yuedu luyd);

    @Delete("delete from yuedu where id = #{id}")
    void delect(Integer id);

    void update(yuedu ryd);
}
