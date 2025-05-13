import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.UnmodifiableMap;

public class Course {
    private String courseName;
    private Map<String, Integer> grades = new HashMap<>();
    private UnmodifiableMap<String, Integer> unmodifiableGrades = UnmodifiableMap.unmodifiableMap(grades);

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(String subject, int grade) {
        /* write */ grades.put(subject, grade);
    }

    public int getGrade(String subject) {
        /* read */ return unmodifiableGrades.get(subject);
    }
}
