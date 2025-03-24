import java.util.SortedSet;
import java.util.TreeSet;

public class StudentGrades {
    private SortedSet<Integer> grades = new TreeSet<>();

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public SortedSet<Integer> getGrades() {
        return grades;
    }
}
