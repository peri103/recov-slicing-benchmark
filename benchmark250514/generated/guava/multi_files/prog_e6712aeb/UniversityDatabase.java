import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class UniversityDatabase {
    private Table<String, String, Integer> studentCourseTable = HashBasedTable.create();

    public void enrollStudentInCourse(String studentName, String courseName, int score) {
        /* write */ studentCourseTable.put(studentName, courseName, score);
    }

    public Integer getStudentScore(String studentName, String courseName) {
        return studentCourseTable.get(studentName, courseName);
    }
}
