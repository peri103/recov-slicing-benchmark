import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }
}
