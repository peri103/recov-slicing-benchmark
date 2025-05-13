import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> scores = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}
