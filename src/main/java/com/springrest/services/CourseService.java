package com.springrest.services;

import com.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
    public Course getCourseById(long courseId);
}
