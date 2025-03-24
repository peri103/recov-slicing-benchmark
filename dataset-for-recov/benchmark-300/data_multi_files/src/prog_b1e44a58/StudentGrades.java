import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
    private ArrayList<Integer> grades = new ArrayList<>();

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
