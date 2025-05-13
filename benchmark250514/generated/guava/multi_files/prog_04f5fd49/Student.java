import com.google.common.collect.TreeMultimap;

public class Student {
    private String name;
    private TreeMultimap<String, Integer> scores;

    public Student(String name, TreeMultimap<String, Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public void addScore(int score) {
        scores.put(name, score);
    }

    public TreeMultimap<String, Integer> getScores() {
        return scores;
    }
}
