import java.util.SortedMap;
import java.util.TreeMap;

public class StudentGrades {
    private SortedMap<String, Integer> grades = new TreeMap<>();

    public void addGrade(String course, int grade) {
        /* write */ grades.put(course, grade);
    }

    public SortedMap<String, Integer> getGrades() {
        return grades;
    }
}
