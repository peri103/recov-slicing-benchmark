import java.util.concurrent.ConcurrentHashMap;

public class Student {
    private String name;
    private ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public int getScore(String subject) {
        return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}
