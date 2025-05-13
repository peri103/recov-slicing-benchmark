import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(name);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
