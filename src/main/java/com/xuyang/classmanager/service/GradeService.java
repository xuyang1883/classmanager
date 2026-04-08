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
}