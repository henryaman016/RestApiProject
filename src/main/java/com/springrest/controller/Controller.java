package com.springrest.controller;

import com.springrest.entities.Course;
import com.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CourseService courseService;
    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
return this.courseService.getCourses();
    }

    // Get a course by ID
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable long courseId) {
        return this.courseService.getCourseById(courseId);
    }
}
