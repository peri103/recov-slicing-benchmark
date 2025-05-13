import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, String> details = new HashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
        details.put("Instructor", "Dr. Smith");
        details.put("Room", "101A");
    }

    public String getCourseDetail(String key) {
        return details.get(key);
    }

    public String getCourseName() {
        return courseName;
    }
}
