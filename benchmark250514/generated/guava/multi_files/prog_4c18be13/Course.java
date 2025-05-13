import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private ArrayTable<String, String, Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        List<String> rowKeys = new ArrayList<>();
        rowKeys.add("student1");
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("assignment1");
        grades = ArrayTable.create(rowKeys, columnKeys);
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String student, String assignment, int grade) {
        /* write */ grades.put(student, assignment, grade);
    }

    public Integer getGrade(String student, String assignment) {
        return grades.get(student, assignment);
    }
}
