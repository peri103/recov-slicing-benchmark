import com.google.common.collect.SortedSetMultimap;
import com.google.common.collect.TreeMultimap;
import java.util.SortedSet;

public class Course {
    private String courseName;
    private SortedSetMultimap<String, Integer> studentScores = TreeMultimap.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public SortedSet<Integer> getScores(String studentName) {
        return studentScores.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
