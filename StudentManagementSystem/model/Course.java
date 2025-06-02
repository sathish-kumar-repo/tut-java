package model;

public class Course {
    private String courseCode;
    private String courseName;

    public Course(String code, String name) {
        this.courseCode = code;
        this.courseName = name;
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }

    @Override
    public String toString() {
        return "Course{" + "courseCode='" + courseCode + "', courseName='" + courseName + "'}";
    }
}