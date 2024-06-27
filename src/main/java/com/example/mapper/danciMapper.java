package com.example.mapper;

import com.example.pojo.danci;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface danciMapper {

    //模糊
//    @Select("select * from danci where zhongwen=#{zhongwen} and riwen=#{riwen}")
    ArrayList<danci> list(@Param("zhongwen") String zhongwen, @Param("riwen") String riwen);

    @Delete("delete from danci where id =#{id}")
    void delect(Integer id);

    @Insert("insert into danci(id, zhongwen, riwen, liju, lijujieshi)" +
            " values(#{id},#{zhongwen},#{riwen},#{liju},#{lijujieshi})")
    void insert(danci dc);

    @Select("select *from danci where id = #{id}")
    danci getById(Integer id);

    void update(danci dc);

    @Select("select * from danci")
    List<danci> listAll();
}
