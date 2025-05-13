import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.ForwardingSet;

public class Student {
    private String name;
    private ForwardingSet<Integer> enrolledCourses;

    public Student(String name) {
        this.name = name;
        Set<Integer> baseSet = new HashSet<>();
        this.enrolledCourses = new ForwardingSet<Integer>() {
            @Override
            protected Set<Integer> delegate() {
                return baseSet;
            }
        };
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
