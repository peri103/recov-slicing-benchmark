import java.util.PriorityQueue;

public class StudentGrades {
    private PriorityQueue<Integer> grades = new PriorityQueue<>();

    public void addGrade(int grade) {
        /* write */ grades.offer(grade);
    }

    public int getTopGrade() {
        return grades.poll();
    }
}
