import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
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
