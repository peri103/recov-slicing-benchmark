import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<String, Integer> studentScores = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public HashMap<String, Integer> getStudentScores() {
        return studentScores;
    }
}
