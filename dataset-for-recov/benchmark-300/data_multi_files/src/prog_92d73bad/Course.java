import java.util.Vector;

public class Course {
    private String courseName;
    private Vector<Student> students = new Vector<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Vector<Student> getStudents() {
        return students;
    }
}
