import java.util.ArrayList;

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

    public ArrayList<Integer> getScores() {
        return scores;
    }
}
