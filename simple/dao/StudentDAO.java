package dao;

import model.Student;
import util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private final String FILE_PATH = "data/students.txt";

    public void save(Student student) {
        FileUtil.appendLine(FILE_PATH, student.getId() + "," + student.getName() + "," + student.getCourse());
    }

    public List<Student> findAll() {
        List<String> lines = FileUtil.readLines(FILE_PATH);
        List<Student> students = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            students.add(new Student(Integer.parseInt(parts[0]), parts[1], parts[2]));
        }
        return students;
    }
}
