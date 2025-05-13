import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;

public class Student {
    private String name;
    private HashSetValuedHashMap<String, Integer> scores = new HashSetValuedHashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public Collection<Integer> getScores(String subject) {
        return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}
