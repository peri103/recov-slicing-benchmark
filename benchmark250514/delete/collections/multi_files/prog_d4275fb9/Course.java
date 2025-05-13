import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}