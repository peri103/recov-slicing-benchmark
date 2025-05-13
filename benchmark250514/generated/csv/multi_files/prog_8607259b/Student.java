import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> scores = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}