package com.victorTello.springboot.learnSpringBootWeb;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Victor Tello"),
                new Course(2, "Learn DevOps", "Victor Tello"),
                new Course(3, "Azure", "Victor Tello"),
                new Course(4, "Learn GCP", "Victor Tello"));

    }

}
