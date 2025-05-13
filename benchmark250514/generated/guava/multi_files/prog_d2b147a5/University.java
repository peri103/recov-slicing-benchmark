import java.util.HashMap;
import java.util.Map;

public class University {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(String courseName, Course course) {
        courses.put(courseName, course);
    }

    public Course getCourse(String courseName) {
        return courses.get(courseName);
    }
}
