import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Course {
    private ArrayListValuedHashMap<String, Integer> courseScores = new ArrayListValuedHashMap<>();

    public void addCourse(String courseName) {
        /* write */ courseScores.put(courseName, 42);  // Example score for demonstration
    }

    public Collection<Integer> getScores(String courseName) {
        return courseScores.get(courseName);
    }
}
