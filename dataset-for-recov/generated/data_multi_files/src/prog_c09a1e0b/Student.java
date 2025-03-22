import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private StudentScores scores;
    private Map<String, Integer> courseGrades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.scores = new StudentScores();
        this.courseGrades = new HashMap<>();
    }

    public void addScore(int score) {
        scores.addScore(score);
    }

    public void addCourseGrade(String courseName, int grade) {
        courseGrades.put(courseName, grade);
    }

    public int getGradeForCourse(String courseName) {
        return courseGrades.getOrDefault(courseName, 0);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public StudentScores getScores() {
        return scores;
    }
}
