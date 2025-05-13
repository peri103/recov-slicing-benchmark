import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return scores.isEmpty() ? 0 : (double) sum / scores.size();
    }
}
