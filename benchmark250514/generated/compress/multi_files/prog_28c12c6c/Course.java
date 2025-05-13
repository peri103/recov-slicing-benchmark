import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Integer> studentIds;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentIds = new ArrayList<>();
    }

    public void enrollStudent(int studentId) {
        studentIds.add(studentId);
    }

    public ArrayList<Integer> getStudentIds() {
        return studentIds;
    }

    public String getCourseName() {
        return courseName;
    }
}
