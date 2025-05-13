import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.Set;

public class StudentCourses {
    private TreeValuedHashMap<String, String> courseMap = new TreeValuedHashMap<>();

    public void addCourse(String courseName) {
        /* write */ courseMap.put(courseName, "Enrolled");
    }

    public Set<String> getCourseStatus(String courseName) {
        /* read */ return courseMap.get(courseName);
    }
}
