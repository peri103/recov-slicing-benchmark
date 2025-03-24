import java.util.Deque;
import java.util.LinkedList;

public class Course {
    private String courseName;
    private Deque<Integer> studentScores = new LinkedList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(int score) {
        /* write */ studentScores.addFirst(score);
    }

    public Deque<Integer> getScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
