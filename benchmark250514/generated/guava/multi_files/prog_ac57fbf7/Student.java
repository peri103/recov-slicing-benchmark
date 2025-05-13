import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private HashMap<String, Integer> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public int getTotalGrades() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}
