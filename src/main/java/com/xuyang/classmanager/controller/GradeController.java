package com.xuyang.classmanager.controller;

import com.xuyang.classmanager.entity.Grade;
import com.xuyang.classmanager.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/my")
    public List<Grade> my(@RequestParam Integer studentId) {
        return gradeService.getGradesByStudentId(studentId);
    }

    @GetMapping("/add")
    public String add(@RequestParam Integer studentId,
                      @RequestParam Integer courseId,
                      @RequestParam Integer score) {
        Grade existing = gradeService.findByStudentIdAndCourseId(studentId, courseId);
        if (existing != null) {
            return "该学生此课程已有成绩，请使用修改功能";
        }
        Grade grade = new Grade();
        grade.setStudentId(studentId);
        grade.setCourseId(Integer.valueOf(String.valueOf(courseId)));
        grade.setScore(score);
        boolean success = gradeService.addGrade(grade);
        return success ? "添加成功" : "添加失败";
    }

    @GetMapping("/update")
    public String update(@RequestParam Integer id, @RequestParam Integer score) {
        boolean success = gradeService.updateGrade(id, score);
        return success ? "修改成功" : "修改失败";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        boolean success = gradeService.deleteGrade(id);
        return success ? "删除成功" : "删除失败";
    }
}