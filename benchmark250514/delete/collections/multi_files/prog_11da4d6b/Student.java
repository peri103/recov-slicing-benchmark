import org.apache.commons.collections4.map.MultiValueMap;

public class Student {
    private String name;
    private MultiValueMap<String, Integer> scores = new MultiValueMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        return (Integer) scores.get(subject).iterator().next();
    }

    public String getName() {
        return name;
    }
}
