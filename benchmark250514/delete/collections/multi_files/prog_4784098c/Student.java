import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import java.util.HashMap;

public class Student {
    private String name;
    private AbstractBidiMapDecorator<String, Integer> scores;

    public Student(String name) {
        this.name = name;
        HashMap<String, Integer> scoreMap = new HashMap<>();
        this.scores = new AbstractBidiMapDecorator<>(scoreMap) {};
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Integer getScore(String subject) {
        return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}
