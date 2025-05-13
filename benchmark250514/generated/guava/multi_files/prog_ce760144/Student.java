import java.util.HashSet;

public class Student {
    private String name;
    private HashSet<Integer> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new HashSet<>();
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public HashSet<Integer> getScores() {
        return scores;
    }

    public int calculateTotalScore() {
        int sum = 0;
        for (Integer score : scores) {
            sum += score;
        }
        return sum;
    }
}
