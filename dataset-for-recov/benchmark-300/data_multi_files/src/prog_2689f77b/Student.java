import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> scores = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
