import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        studentScores = new HashMap<>();
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public int getStudentScore(String studentName) {
        return studentScores.getOrDefault(studentName, 0);
    }

    public void printAllScores() {
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}