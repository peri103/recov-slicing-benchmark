import java.util.concurrent.ConcurrentSkipListMap;

public class Course {
    private String courseName;
    private ConcurrentSkipListMap<String, Integer> studentScores = new ConcurrentSkipListMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Integer getScore(String studentName) {
        return studentScores.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
