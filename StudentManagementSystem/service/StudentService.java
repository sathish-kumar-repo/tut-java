package service;

import model.Student;
import java.util.*;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void listStudents() {
        students.forEach(System.out::println);
    }

    public Student getStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}