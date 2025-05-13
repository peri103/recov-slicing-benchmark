import com.google.common.collect.ImmutableListMultimap;
import java.util.HashMap;
import java.util.Map;

public class CourseManager {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(String courseName) {
        courses.put(courseName, new Course(courseName));
    }

    public void enrollStudent(String courseName, String studentName) {
        Course course = courses.get(courseName);
        if (course != null) {
            course.addStudent(studentName);
        }
    }

    public ImmutableListMultimap<String, String> getCourseStudents(String courseName) {
        Course course = courses.get(courseName);
        if (course != null) {
            return course.getStudentList();
        }
        return null;
    }
}
