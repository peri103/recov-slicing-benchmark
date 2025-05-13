import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class StudentCourses {
    private MultiValuedMap<String, String> modifiableCourseMap = new ArrayListValuedHashMap<>();
    private UnmodifiableMultiValuedMap<String, String> courseMap = new UnmodifiableMultiValuedMap<>(modifiableCourseMap);

    public void addCourse(String course) {
        modifiableCourseMap.put("courses", course); // This is effectively the write operation
    }

    public UnmodifiableMultiValuedMap<String, String> getCourseMap() {
        return courseMap;
    }
}
