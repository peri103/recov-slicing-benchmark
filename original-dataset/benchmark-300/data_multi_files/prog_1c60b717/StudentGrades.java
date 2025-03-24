import java.util.SortedMap;
import java.util.TreeMap;

public class StudentGrades {
    private SortedMap<String, Integer> grades = new TreeMap<>();

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public SortedMap<String, Integer> getGrades() {
        return grades;
    }
}
