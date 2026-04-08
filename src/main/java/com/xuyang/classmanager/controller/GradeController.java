package com.xuyang.classmanager.controller;

import com.xuyang.classmanager.entity.Grade;
import com.xuyang.classmanager.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/list")
    public List<Grade> list() {
        return gradeService.getAllGrades();
    }
}