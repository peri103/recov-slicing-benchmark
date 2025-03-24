import java.util.Deque;
import java.util.ArrayDeque;

public class Course {
    private String courseName;
    private Deque<Integer> studentScores = new ArrayDeque<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(int score) {
        /* write */ studentScores.addLast(score);
    }

    public Deque<Integer> getScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
