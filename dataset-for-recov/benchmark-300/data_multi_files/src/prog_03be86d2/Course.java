import java.util.PriorityQueue;

public class Course {
    private String courseName;
    private PriorityQueue<Integer> grades = new PriorityQueue<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.offer(grade);
    }

    public PriorityQueue<Integer> getGrades() {
        return grades;
    }
}
