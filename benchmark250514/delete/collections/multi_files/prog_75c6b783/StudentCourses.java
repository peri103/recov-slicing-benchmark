import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.Collection;

public class StudentCourses {
    private MultiValuedMap<String, String> originalMap = new MultiValueMap<>();
    private TransformedMultiValuedMap<String, String> courseMap = TransformedMultiValuedMap.transformingMap(originalMap, 
        key -> key.toUpperCase(), 
        value -> value);

    public void addCourse(String courseName) {
        /* write */ courseMap.put("courses", courseName);
    }

    public Collection<String> getCourses() {
        /* read */ return courseMap.get("courses");
    }
}
