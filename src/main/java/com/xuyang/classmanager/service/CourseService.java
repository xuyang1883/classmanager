package com.xuyang.classmanager.service;

import com.xuyang.classmanager.entity.Course;
import com.xuyang.classmanager.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getAllCourses() {
        return courseMapper.findAll();
    }

    public Course getCourseById(Integer id) {
        return courseMapper.findById(id);
    }

    public boolean addCourse(Course course) {
        return courseMapper.add(course) > 0;
    }

    public boolean updateCourse(Course course) {
        return courseMapper.update(course) > 0;
    }

    public boolean deleteCourse(Integer id) {
        return courseMapper.delete(id) > 0;
    }
}