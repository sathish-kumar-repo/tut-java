import model.*;
import service.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. List Students\n3. Add Course\n4. List Courses\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // flush

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    studentService.addStudent(new Student(id, name, email));
                }
                case 2 -> studentService.listStudents();
                case 3 -> {
                    System.out.print("Enter Course Code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String name = sc.nextLine();
                    courseService.addCourse(new Course(code, name));
                }
                case 4 -> courseService.listCourses();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}