import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Course {
    private String courseName;
    private Multimap<String, Integer> studentScores = ArrayListMultimap.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Multimap<String, Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
