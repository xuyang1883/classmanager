package com.xuyang.classmanager.mapper;

import com.xuyang.classmanager.entity.Course;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface CourseMapper {

    // 查询所有课程
    @Select("SELECT * FROM course ORDER BY id")
    List<Course> findAll();

    // 根据ID查询课程
    @Select("SELECT * FROM course WHERE id = #{id}")
    Course findById(@Param("id") Integer id);

    // 添加课程
    @Insert("INSERT INTO course (course_name, credit, hours) VALUES (#{courseName}, #{credit}, #{hours})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int add(Course course);

    // 更新课程
    @Update("UPDATE course SET course_name = #{courseName}, credit = #{credit}, hours = #{hours} WHERE id = #{id}")
    int update(Course course);

    // 删除课程
    @Delete("DELETE FROM course WHERE id = #{id}")
    int delete(@Param("id") Integer id);
}