import java.util.concurrent.BlockingDeque;

public class Course {
    private String courseName;
    private Student student;

    public Course(String courseName, Student student) {
        this.courseName = courseName;
        this.student = student;
    }

    public void addStudentScore(int score) {
        student.addScore(score);
    }

    public BlockingDeque<Integer> getStudentScores() {
        return student.getScores();
    }
}
