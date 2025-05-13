import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private Table<String, String, Integer> courseGrades = HashBasedTable.create();

    public void addGrade(String courseName, int grade) {
        /* write */ courseGrades.put("student1", courseName, grade);
    }

    public Integer getGrade(String courseName) {
        /* read */ return courseGrades.get("student1", courseName);
    }
}
