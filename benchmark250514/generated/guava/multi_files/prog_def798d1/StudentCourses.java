import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

public class StudentCourses {
    private Multimap<String, Integer> courseScores = LinkedHashMultimap.create();

    public void addCourse(String courseName, int score) {
        /* write */ courseScores.put(courseName, score);
    }

    public Multimap<String, Integer> getCourseScores() {
        return courseScores;
    }
}
