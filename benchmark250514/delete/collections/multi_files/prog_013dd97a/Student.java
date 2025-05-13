import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.UnmodifiableMap;

public class Student {
    private String name;
    private Map<String, Integer> grades = new HashMap<>();
    private UnmodifiableMap<String, Integer> unmodifiableGrades = UnmodifiableMap.unmodifiableMap(grades);

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String course, int grade) {
        /* write */ grades.put(course, grade);
    }

    public Integer getGrade(String course) {
        /* read */ return unmodifiableGrades.get(course);
    }

    public String getName() {
        return name;
    }
}
