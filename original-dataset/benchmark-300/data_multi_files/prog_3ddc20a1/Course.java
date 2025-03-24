import java.util.concurrent.LinkedBlockingDeque;

public class Course {
    private String courseName;
    private LinkedBlockingDeque<Student> students = new LinkedBlockingDeque<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.addLast(student);
    }

    public LinkedBlockingDeque<Student> getStudents() {
        return students;
    }
}
