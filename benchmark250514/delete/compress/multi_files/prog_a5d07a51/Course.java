import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private HashMap<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.studentScores = new HashMap<>();
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void assignScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public int getScore(String studentName) {
        return studentScores.getOrDefault(studentName, 0);
    }

    public ArrayList<String> getStudents() {
        return students;
    }
}
