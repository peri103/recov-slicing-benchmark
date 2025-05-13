import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    private StudentScores studentScores;
    
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        this.studentScores = new StudentScores();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public StudentScores getStudentScores() {
        return studentScores;
    }
}
