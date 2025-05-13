import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private String courseName;
    private Table<String, String, Integer> scoresTable;

    public Course(String courseName) {
        this.courseName = courseName;
        this.scoresTable = HashBasedTable.create();
    }

    public void addScore(String studentName, String exam, int score) {
        /* write */ scoresTable.put(studentName, exam, score);
    }

    public Integer getScore(String studentName, String exam) {
        return scoresTable.get(studentName, exam);
    }

    public String getCourseName() {
        return courseName;
    }
}
