package com.xuyang.classmanager.mapper;

import com.xuyang.classmanager.entity.Grade;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface GradeMapper {

    @Select("SELECT * FROM grade ORDER BY student_id")
    List<Grade> findAll();
}