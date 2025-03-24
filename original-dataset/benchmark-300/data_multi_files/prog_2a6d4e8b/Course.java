import java.util.concurrent.LinkedBlockingQueue;

public class Course {
    private String courseName;
    private LinkedBlockingQueue<Integer> scores = new LinkedBlockingQueue<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(int score) {
        try {
            scores.put(score);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public LinkedBlockingQueue<Integer> getScores() {
        return scores;
    }
}
