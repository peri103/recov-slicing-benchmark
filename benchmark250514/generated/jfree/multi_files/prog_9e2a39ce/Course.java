import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;
    
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    
    public void enrollStudent(Student student) {
        students.add(student);
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public String getCourseName() {
        return courseName;
    }
}