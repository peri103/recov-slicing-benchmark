import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String studentName) {
        students.add(studentName);
    }

    public void listStudents() {
        System.out.println("Course: " + courseName);
        for (String student : students) {
            System.out.println("Student: " + student);
        }
    }
}
