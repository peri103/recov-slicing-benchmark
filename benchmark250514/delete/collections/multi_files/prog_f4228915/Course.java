import org.apache.commons.collections4.multimap.LinkedHashValuedHashMap;
import java.util.Collection;

public class Course {
    private LinkedHashValuedHashMap<String, Integer> studentScores = new LinkedHashValuedHashMap<>();

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Collection<Integer> getStudentScores(String studentName) {
        return studentScores.get(studentName);
    }
}
