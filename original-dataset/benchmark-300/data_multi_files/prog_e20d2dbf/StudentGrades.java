import java.util.Deque;
import java.util.LinkedList;

public class StudentGrades {
    private Deque<Integer> grades = new LinkedList<>();

    public void addGrade(int grade) {
        /* write */ grades.addFirst(grade);
    }

    public Deque<Integer> getGrades() {
        return grades;
    }
}
