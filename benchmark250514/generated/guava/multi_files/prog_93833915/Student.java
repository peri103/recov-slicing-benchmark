import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Course> courses = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.put(course.getCourseName(), course);
    }

    public Course getCourse(String courseName) {
        return courses.get(courseName);
    }

    public String getName() {
        return name;
    }
}
