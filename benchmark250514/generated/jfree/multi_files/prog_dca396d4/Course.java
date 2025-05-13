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

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }
    }
}
