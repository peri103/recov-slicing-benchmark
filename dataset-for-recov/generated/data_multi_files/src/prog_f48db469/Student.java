import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> courseScores;

    public Student(String name) {
        this.name = name;
        this.courseScores = new HashMap<>();
    }

    public void addCourseScore(String course, int score) {
        courseScores.put(course, score);
    }

    public int getCourseScore(String course) {
        return courseScores.getOrDefault(course, 0);
    }

    public HashMap<String, Integer> getCourseScores() {
        return courseScores;
    }
}
