import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageScore() {
        int totalScore = 0;
        int count = 0;
        for (Student student : students) {
            for (int score : student.getScores()) {
                totalScore += score;
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalScore / count;
    }
}
