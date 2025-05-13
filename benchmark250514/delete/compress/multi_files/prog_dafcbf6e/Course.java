import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String, Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }
}
