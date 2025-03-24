import java.util.SortedMap;
import java.util.TreeMap;

public class Student {
    private String name;
    private SortedMap<String, Integer> scores = new TreeMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public SortedMap<String, Integer> getScores() {
        return scores;
    }
}
