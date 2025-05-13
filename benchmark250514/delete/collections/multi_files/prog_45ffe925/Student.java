import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.Collection;

public class Student {
    private String name;
    private MultiValuedMap<String, String> transformedMap;

    public Student(String name) {
        this.name = name;
        LinkedMap<String, String> baseMap = new LinkedMap<>();
        this.transformedMap = TransformedMultiValuedMap.transformedMap(baseMap, null, null);
    }

    public void addCourse(String course, String grade) {
        /* write */ transformedMap.put(course, grade);
    }

    public Collection<String> getGrades(String course) {
        return transformedMap.get(course);
    }
}
