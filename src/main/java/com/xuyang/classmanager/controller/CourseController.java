package com.xuyang.classmanager.controller;

import com.xuyang.classmanager.entity.Course;
import com.xuyang.classmanager.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/list")
    public List<Course> list() {
        return courseService.getAllCourses();
    }

    @GetMapping("/add")
    public String add(@RequestParam String name) {
        Course course = new Course();
        course.setName(name);
        boolean success = courseService.addCourse(course);
        return success ? "添加成功" : "添加失败";
    }

    @GetMapping("/update")
    public String update(@RequestParam Integer id, @RequestParam String name) {
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        boolean success = courseService.updateCourse(course);
        return success ? "修改成功" : "修改失败";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        boolean success = courseService.deleteCourse(id);
        return success ? "删除成功" : "删除失败";
    }
}