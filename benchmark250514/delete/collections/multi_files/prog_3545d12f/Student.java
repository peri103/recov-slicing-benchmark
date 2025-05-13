import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new HashMap<>();
    }

    public void enrollCourse(String courseName, int grade) {
        courses.put(courseName, grade);
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
