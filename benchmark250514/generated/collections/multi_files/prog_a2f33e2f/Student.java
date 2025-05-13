import java.util.Collection;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Student {
    private String name;
    private MultiValuedMap<String, String> scores = new ArrayListValuedHashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(String subject, String score) {
        /* write */ scores.put(subject, score);
    }

    public Collection<String> getScores(String subject) {
        return scores.get(subject);
    }

    public String getName() {
        return name;
    }
}
