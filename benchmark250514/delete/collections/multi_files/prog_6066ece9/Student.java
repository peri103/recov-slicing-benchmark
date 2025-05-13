import org.apache.commons.collections4.map.StaticBucketMap;

public class Student {
    private String name;
    private StaticBucketMap scores = new StaticBucketMap();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public StaticBucketMap getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
