import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Student {
    private String name;
    private HashSetValuedHashMap<String, Integer> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new HashSetValuedHashMap<>();
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public HashSetValuedHashMap<String, Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
