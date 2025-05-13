import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private Set<String> completedCourses;

    public Student(String name) {
        this.name = name;
        this.completedCourses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void completeCourse(String courseName) {
        completedCourses.add(courseName);
    }

    public Set<String> getCompletedCourses() {
        return completedCourses;
    }
}
