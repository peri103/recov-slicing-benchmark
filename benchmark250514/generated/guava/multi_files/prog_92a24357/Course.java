import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;

public class Course {
    private String courseName;
    private SetMultimap<String, Integer> studentScores = HashMultimap.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Set<Integer> getStudentScores(String studentName) {
        return studentScores.get(studentName);
    }
}
