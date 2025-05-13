import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class Course {
    private String courseName;
    private ListMultimap<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = ArrayListMultimap.create();
    }

    public void addScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public ListMultimap<String, Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
