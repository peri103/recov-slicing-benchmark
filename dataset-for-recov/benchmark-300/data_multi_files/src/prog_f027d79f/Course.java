import java.util.concurrent.PriorityBlockingQueue;

public class Course {
    private PriorityBlockingQueue<Integer> studentScores = new PriorityBlockingQueue<>();

    public void addScore(int score) {
        /* write */ studentScores.offer(score);
    }

    public PriorityBlockingQueue<Integer> getScores() {
        return studentScores;
    }
}
