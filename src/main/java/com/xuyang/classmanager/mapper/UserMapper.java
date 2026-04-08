package com.xuyang.classmanager.mapper;

import com.xuyang.classmanager.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE username = #{username} AND password = #{password}")
    User login(@Param("username") String username, @Param("password") String password);
}