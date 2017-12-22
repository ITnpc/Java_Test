package com.tang.mvcdemo.service;


import com.tang.mvcdemo.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {

    Course getCoursebyId(Integer courseId);

}
