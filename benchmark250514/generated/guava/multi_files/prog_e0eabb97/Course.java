import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private RangeManager rangeManager = new RangeManager();
    private List<String> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        enrolledStudents.add(studentName);
    }

    public void addGradeRange(int start, int end, String grade) {
        rangeManager.addRange(start, end, grade);
    }

    public String getGrade(int score) {
        return rangeManager.getValue(score);
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }
}
