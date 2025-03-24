import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName, List<Student> students) {
        this.courseName = courseName;
        this.students = students;
    }

    public void printStudentScores() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}
