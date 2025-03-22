import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> courses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    public boolean isEnrolled(String course) {
        return courses.contains(course);
    }

    public Set<String> getCourses() {
        return courses;
    }
}
