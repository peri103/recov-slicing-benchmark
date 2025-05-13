import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void printGrades() {
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
