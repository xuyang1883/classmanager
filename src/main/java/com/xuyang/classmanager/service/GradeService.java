package com.xuyang.classmanager.service;

import com.xuyang.classmanager.entity.Grade;
import com.xuyang.classmanager.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    public List<Grade> getAllGrades() {
        return gradeMapper.findAll();
    }

    public List<Grade> getGradesByStudentId(Integer studentId) {
        return gradeMapper.findByStudentId(studentId);
    }

    public Grade findByStudentIdAndCourseId(Integer studentId, Integer courseId) {
        return gradeMapper.findByStudentIdAndCourseId(studentId, courseId);
    }

    public boolean addGrade(Grade grade) {
        return gradeMapper.add(grade) > 0;
    }

    public boolean updateGrade(Integer id, Integer score) {
        return gradeMapper.update(id, score) > 0;
    }

    public boolean deleteGrade(Integer id) {
        return gradeMapper.delete(id) > 0;
    }
}