import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public int getGrade(String course) {
        return grades.get(course);
    }

    public String getName() {
        return name;
    }
}
