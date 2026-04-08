package com.xuyang.classmanager.mapper;

import com.xuyang.classmanager.entity.Announcement;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface AnnouncementMapper {

    @Select("SELECT * FROM announcement ORDER BY create_time DESC")
    List<Announcement> findAll();

    @Insert("insert into announcement(title,content,create_time) values (#{title},#{content},now())")
    int add(Announcement announcement);
}