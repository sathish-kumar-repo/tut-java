import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private int duration; // in hours

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', duration=" + duration + " hours}";
    }
}

class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void listCoursesWithPrintln() {
        System.out.println("\n-- Using System.out::println --");
        courses.forEach(System.out::println); // Calls Course.toString()
    }

    public void listCoursesWithCustomFunction() {
        System.out.println("\n-- Using custom function --");
        courses.forEach(CourseService::printCourseDetails);
    }



    public static void printCourseDetails(Course course) {
        System.out.println("Course Name: " + course.getName() + ", Duration: " + course.getDuration() + " hours");
    }
}

public class app {
    public static void main(String[] args) {
        CourseService service = new CourseService();

        service.addCourse(new Course("Java Basics", 10));
        service.addCourse(new Course("Advanced Java", 20));
        service.addCourse(new Course("Spring Boot", 15));

        service.listCoursesWithPrintln();         // Using toString() with System.out::println
        service.listCoursesWithCustomFunction();  // Using custom function with method reference
    }
}
