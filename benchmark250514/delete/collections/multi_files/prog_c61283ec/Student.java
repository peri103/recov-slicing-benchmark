import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Student {
    private String name;
    private MultiValuedMap<String, String> modifiableMap = new MultiValueMap<>();
    private UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(String courseName) {
        /* write */ modifiableMap.put("courses", courseName);
    }

    public String getEnrolledCourse() {
        /* read */ return map.get("courses").iterator().next();
    }

    public String getName() {
        return name;
    }
}
