import java.util.concurrent.ConcurrentLinkedDeque;

public class Course {
    private String courseName;
    private ConcurrentLinkedDeque<Student> students = new ConcurrentLinkedDeque<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.addLast(student);
    }

    public ConcurrentLinkedDeque<Student> getStudents() {
        return students;
    }
}
