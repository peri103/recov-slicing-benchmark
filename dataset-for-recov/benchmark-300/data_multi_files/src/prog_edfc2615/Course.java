import java.util.SortedMap;
import java.util.TreeMap;

public class Course {
    private SortedMap<Integer, String> studentGrades = new TreeMap<>();

    public void addGrade(int studentId, String grade) {
        /* write */ studentGrades.put(studentId, grade);
    }

    public SortedMap<Integer, String> getStudentGrades() {
        return studentGrades;
    }
}
