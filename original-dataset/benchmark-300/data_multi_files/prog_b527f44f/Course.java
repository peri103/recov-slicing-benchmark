import java.util.concurrent.CopyOnWriteArraySet;

public class Course {
    private String courseName;
    private CopyOnWriteArraySet<Student> students = new CopyOnWriteArraySet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public CopyOnWriteArraySet<Student> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}
