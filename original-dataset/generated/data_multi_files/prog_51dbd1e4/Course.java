import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}
