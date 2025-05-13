import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private String courseName;
    private Table<String, String, Integer> studentScores = HashBasedTable.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, String assignment, int score) {
        /* write */ studentScores.put(studentName, assignment, score);
    }

    public Integer getStudentScore(String studentName, String assignment) {
        return studentScores.get(studentName, assignment);
    }

    public String getCourseName() {
        return courseName;
    }
}
