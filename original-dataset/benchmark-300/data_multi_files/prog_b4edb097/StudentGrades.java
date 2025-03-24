import java.util.PriorityQueue;

public class StudentGrades {
    private PriorityQueue<Integer> grades = new PriorityQueue<>();

    public void addGrade(int grade) {
        /* write */ grades.offer(grade);
    }

    public PriorityQueue<Integer> getGrades() {
        return grades;
    }
}
