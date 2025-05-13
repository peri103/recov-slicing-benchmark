import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private TreeBasedTable<Integer, Integer, String> grades = TreeBasedTable.create();

    public void addGrade(int studentId, int courseId, String grade) {
        /* write */ grades.put(studentId, courseId, grade);
    }

    public String getGrade(int studentId, int courseId) {
        return grades.get(studentId, courseId);
    }

    public void displayGrades() {
        for (Table.Cell<Integer, Integer, String> cell : grades.cellSet()) {
            System.out.println("Student ID: " + cell.getRowKey() + ", Course ID: " + cell.getColumnKey() + ", Grade: " + cell.getValue());
        }
    }
}
