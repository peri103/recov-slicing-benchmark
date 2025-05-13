import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;

public class Course {
    private String courseName;
    private SetMultimap<Integer, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = HashMultimap.create();
    }

    public void addScore(int studentId, int score) {
        /* write */ studentScores.put(studentId, score);
    }

    public SetMultimap<Integer, Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
