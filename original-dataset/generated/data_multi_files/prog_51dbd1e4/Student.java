import java.util.HashSet;

public class Student {
    private String name;
    private HashSet<Integer> enrolledCourses = new HashSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(int courseId) {
        /* write */ enrolledCourses.add(courseId);
    }

    public boolean isEnrolled(int courseId) {
        return enrolledCourses.contains(courseId);
    }

    public String getName() {
        return name;
    }
}
