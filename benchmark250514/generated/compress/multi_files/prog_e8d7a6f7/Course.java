import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}