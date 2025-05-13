import com.google.common.collect.LinkedHashBiMap;

public class Student {
    private String name;
    private LinkedHashBiMap<String, Integer> scores = LinkedHashBiMap.create();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        /* read */ return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}