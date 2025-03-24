import java.util.SortedSet;
import java.util.TreeSet;

public class Student {
    private String name;
    private SortedSet<Integer> scores = new TreeSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public SortedSet<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
