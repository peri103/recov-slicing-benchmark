import java.util.LinkedList;

public class Course {
    private String courseName;
    private LinkedList<Student> students = new LinkedList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public LinkedList<Student> getStudents() {
        return students;
    }
}
