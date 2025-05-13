import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;

public class Course {
    private ListMultimap<String, Integer> studentScores = ArrayListMultimap.create();

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public List<Integer> getStudentScores(String studentName) {
        return studentScores.get(studentName);
    }
}
