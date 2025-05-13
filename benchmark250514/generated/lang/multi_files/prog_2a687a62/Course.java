import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Person> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Person student) {
        enrolledStudents.add(student);
    }

    public ArrayList<Person> getEnrolledStudents() {
        return enrolledStudents;
    }
}
