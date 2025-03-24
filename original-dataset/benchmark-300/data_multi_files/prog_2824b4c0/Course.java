import java.util.concurrent.CopyOnWriteArrayList;

public class Course {
    private String courseName;
    private CopyOnWriteArrayList<Integer> studentScores = new CopyOnWriteArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addScore(int score) {
        /* write */ studentScores.add(score);
    }

    public CopyOnWriteArrayList<Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
