package com.springrest.services.Impl;

import com.springrest.entities.Course;
import com.springrest.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(145,"Java Core Course","this course contains java basic"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseById(long courseId) {
        for (Course course : list) {
            if (course.getId() == courseId) {
                return course;
            }
        }
        return null; //


    }}
