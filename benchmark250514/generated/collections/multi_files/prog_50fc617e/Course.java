import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiValuedMap;

public class Course {
    private MultiValuedMap<String, Integer> studentScores = new ArrayListValuedHashMap<>();

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public MultiValuedMap<String, Integer> getStudentScores() {
        return studentScores;
    }
}
