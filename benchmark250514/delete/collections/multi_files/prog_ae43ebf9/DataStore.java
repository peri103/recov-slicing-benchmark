import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class DataStore {
    private MultiValuedMap<String, String> studentCourseMap;

    public DataStore() {
        MultiValuedMap<String, String> originalMap = new MultiValueMap<>();
        this.studentCourseMap = new TransformedMultiValuedMap<>(originalMap, null, null);
    }

    public void addEnrollment(String studentName, String courseName) {
        /* write */ studentCourseMap.put(studentName, courseName);
    }

    public MultiValuedMap<String, String> getStudentCourseMap() {
        return studentCourseMap;
    }
}
