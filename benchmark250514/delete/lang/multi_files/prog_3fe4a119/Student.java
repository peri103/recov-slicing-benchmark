import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public List<Integer> getScores() {
        return this.scores;
    }

    public String getName() {
        return this.name;
    }
}
