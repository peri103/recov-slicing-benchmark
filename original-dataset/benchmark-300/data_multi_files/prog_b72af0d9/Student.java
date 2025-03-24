import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
