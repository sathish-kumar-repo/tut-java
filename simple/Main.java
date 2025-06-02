import service.StudentService;
import threads.BackupThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System");

        // Start background backup thread
        new BackupThread().start();

        StudentService service = new StudentService();
        service.run();  // Menu loop
    }
}
