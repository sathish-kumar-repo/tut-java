package service;

import model.Course;
import java.util.*;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void listCourses() {
        // courses.forEach(item -> System.out.println(item));
        courses.forEach(System.out::println); // System.out.println(course);

    }
}