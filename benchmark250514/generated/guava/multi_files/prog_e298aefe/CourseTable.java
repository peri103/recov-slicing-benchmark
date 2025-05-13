import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class CourseTable {
    private TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();

    public void addCourse(int studentId, int courseId, String courseName) {
        /* write */ table.put(studentId, courseId, courseName);
    }

    public String getCourse(int studentId, int courseId) {
        return table.get(studentId, courseId);
    }
}
