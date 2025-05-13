import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void printCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
