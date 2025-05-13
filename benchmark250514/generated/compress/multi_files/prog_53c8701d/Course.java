import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    public ArrayList<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
