import com.google.common.collect.ArrayTable;
import com.google.common.collect.Lists;
import java.util.List;

public class Course {
    private ArrayTable<String, String, Integer> grades;

    public Course() {
        List<String> students = Lists.newArrayList("Alice", "Bob");
        List<String> assignments = Lists.newArrayList("Assignment1", "Assignment2");
        grades = ArrayTable.create(students, assignments);
    }

    public void addGrade(String student, String assignment, int grade) {
        /* write */ grades.put(student, assignment, grade);
    }

    public Integer getGrade(String student, String assignment) {
        return grades.get(student, assignment);
    }
}
