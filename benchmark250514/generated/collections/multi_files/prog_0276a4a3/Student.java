import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private StudentScores scores;

    public Student(String name) {
        this.name = name;
        this.scores = new StudentScores();
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public List<Integer> getScores() {
        return scores.getScores();
    }

    public String getName() {
        return name;
    }
}
