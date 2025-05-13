import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private String courseName;
    private Table<String, String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = HashBasedTable.create();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudentScore(String studentName, String examName, int score) {
        /* write */ studentScores.put(studentName, examName, score);
    }

    public Integer getStudentScore(String studentName, String examName) {
        return studentScores.get(studentName, examName);
    }
}
