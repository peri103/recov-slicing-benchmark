import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private String courseName;
    private Table<String, String, Integer> studentScores = HashBasedTable.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, String assessment, int score) {
        /* write */ studentScores.put(studentName, assessment, score);
    }

    public Integer getStudentScore(String studentName, String assessment) {
        return studentScores.get(studentName, assessment);
    }

    public String getCourseName() {
        return courseName;
    }
}
