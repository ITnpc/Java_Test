package com.tang.mvcdemo.controller;

import com.tang.mvcdemo.model.Course;
import com.tang.mvcdemo.service.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/courses")
public class CourseController {

    private static Logger log = LoggerFactory.getLogger(CourseController.class);

    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(Integer courseId, Model model) {
        log.debug("In viewCourse, courseId={}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        model.addAttribute(course);

        return "course_overview";
    }
}
