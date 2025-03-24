import java.util.HashSet;

public class Course {
    private String courseName;
    private HashSet<Student> students = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public HashSet<Student> getStudents() {
        return students;
    }
}
