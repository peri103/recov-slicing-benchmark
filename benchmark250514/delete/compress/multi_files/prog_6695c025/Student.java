import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<String> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(String course) {
        courses.add(course);
    }

    public List<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
