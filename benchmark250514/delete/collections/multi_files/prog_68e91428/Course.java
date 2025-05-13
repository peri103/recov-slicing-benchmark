import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseName;
    private Map<String, Integer> grades = new HashMap<>();
    private UnmodifiableMap<String, Integer> unmodifiableGrades = UnmodifiableMap.unmodifiableMap(grades);

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public Integer getGrade(String studentName) {
        /* read */ return unmodifiableGrades.get(studentName);
    }
}
