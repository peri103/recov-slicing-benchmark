import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.UnmodifiableMap;

public class Course {
    private String courseName;
    private Map<String, Integer> grades;
    private UnmodifiableMap<String, Integer> unmodifiableGrades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new HashMap<>();
        this.grades.put("initial", 0); // Initialize with a default grade
        this.unmodifiableGrades = UnmodifiableMap.unmodifiableMap(grades);
    }

    public void addGrade(String studentName, int grade) {
        /* write */ grades.put(studentName, grade);
    }

    public int getGrade(String studentName) {
        /* read */ return unmodifiableGrades.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
