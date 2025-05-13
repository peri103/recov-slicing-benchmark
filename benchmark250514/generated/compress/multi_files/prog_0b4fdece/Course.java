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

    public void printStudentNames() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}
