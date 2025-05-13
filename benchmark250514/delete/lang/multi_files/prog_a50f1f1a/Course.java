import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(String studentName) {
        students.add(studentName);
    }

    public ArrayList<String> getEnrolledStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}
