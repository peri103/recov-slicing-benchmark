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

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
