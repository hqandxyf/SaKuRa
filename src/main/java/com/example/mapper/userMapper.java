package com.example.mapper;

import com.example.pojo.user;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {
    @Insert("insert into user(id,username,password)" +
            "VALUES(#{id},#{username},#{password})")
    void insert(user user);

    //查询是否有用户账号（登录）
    @Select("select * from user where username = #{username} and password=#{password}")
    user getByUsernameAndPassword(user user);

    @Select("select * from user")
    List<user> getUser();

    @Delete("delete from user where id = #{id}")
    void deleteUser(Integer id);

    void updateUser(user user);
}
