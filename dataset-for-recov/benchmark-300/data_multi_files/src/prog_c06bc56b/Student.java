import java.util.concurrent.CopyOnWriteArraySet;

public class Student {
    private String name;
    private CopyOnWriteArraySet<Integer> scores = new CopyOnWriteArraySet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public CopyOnWriteArraySet<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
