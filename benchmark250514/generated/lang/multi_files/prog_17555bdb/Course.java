import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayStudents() {
        for (Student student : enrolledStudents) {
            System.out.println("Student: " + student.getPerformanceScore());
        }
    }
}