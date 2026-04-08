package com.xuyang.classmanager.mapper;

import com.xuyang.classmanager.entity.Grade;
import org.apache.ibatis.annotations.*;
import java.util.List;

public interface GradeMapper {

    // 查询所有成绩（关联课程表获取课程名称）
    @Select("SELECT g.id, g.student_id as studentId, g.course_id as courseId, g.score, c.name as courseName " +
            "FROM grade g LEFT JOIN course c ON g.course_id = c.id ORDER BY g.student_id")
    List<Grade> findAll();

    // 根据学生ID查询成绩
    @Select("SELECT g.id, g.student_id as studentId, g.course_id as courseId, g.score, c.name as courseName " +
            "FROM grade g LEFT JOIN course c ON g.course_id = c.id WHERE g.student_id = #{studentId} ORDER BY g.id")
    List<Grade> findByStudentId(@Param("studentId") Integer studentId);

    // 检查是否已存在（同一学生同一课程）
    @Select("SELECT g.id, g.student_id as studentId, g.course_id as courseId, g.score " +
            "FROM grade g WHERE g.student_id = #{studentId} AND g.course_id = #{courseId}")
    Grade findByStudentIdAndCourseId(@Param("studentId") Integer studentId, @Param("courseId") Integer courseId);

    // 添加成绩
    @Insert("INSERT INTO grade (student_id, course_id, score) VALUES (#{studentId}, #{courseId}, #{score})")
    int add(Grade grade);

    // 修改成绩
    @Update("UPDATE grade SET score = #{score} WHERE id = #{id}")
    int update(@Param("id") Integer id, @Param("score") Integer score);

    // 删除成绩
    @Delete("DELETE FROM grade WHERE id = #{id}")
    int delete(@Param("id") Integer id);
}