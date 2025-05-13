import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Course {
    private Table<String, String, Integer> courseGrades;

    public Course() {
        courseGrades = HashBasedTable.create();
    }

    public void addGrade(String courseName, int grade) {
        /* write */ courseGrades.put(courseName, "grade", grade);
    }

    public int getGrade(String courseName) {
        /* read */ return courseGrades.get(courseName, "grade");
    }
}
