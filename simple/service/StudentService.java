package service;

import model.Student;
import util.InputUtil;
import dao.StudentDAO;

import java.util.List;

public class StudentService {
    private StudentDAO dao = new StudentDAO();

    public void run() {
        while (true) {
            System.out.println("\n1. Add Student\n2. List Students\n3. Exit");
            int choice = InputUtil.getInt("Enter choice: ");
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> listStudents();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    private void addStudent() {
        int id = InputUtil.getInt("Enter ID: ");
        String name = InputUtil.getString("Enter name: ");
        String course = InputUtil.getString("Enter course: ");
        dao.save(new Student(id, name, course));
        System.out.println("Student saved!");
    }

    private void listStudents() {
        List<Student> students = dao.findAll();
        students.forEach(System.out::println);
    }
}
