import java.util.HashMap;

public class Course {
    private String courseName;
    private HashMap<Student, StudentScores> studentScoresMap = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        studentScoresMap.put(student, student.getScores());
    }

    public void addStudentScore(Student student, int score) {
        student.addScore(score);
    }

    public void displayScores() {
        for (Student student : studentScoresMap.keySet()) {
            System.out.println("Scores for " + student.getName() + ": " + studentScoresMap.get(student).getScores());
        }
    }
}
