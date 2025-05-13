import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String, Student> students = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }

    public String getCourseName() {
        return courseName;
    }
}
