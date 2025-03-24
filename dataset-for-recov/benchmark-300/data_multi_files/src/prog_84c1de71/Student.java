import java.util.HashSet;

public class Student {
    private String name;
    private HashSet<Integer> scores = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public HashSet<Integer> getScores() {
        return scores;
    }
}
