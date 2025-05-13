import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, String> modifiableMap = new HashMap<>();
    private UnmodifiableMap<String, String> studentGrades = UnmodifiableMap.unmodifiableMap(modifiableMap);

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void assignGrade(String studentName, String grade) {
        /* write */ modifiableMap.put(studentName, grade);
    }

    public String getStudentGrade(String studentName) {
        return studentGrades.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
