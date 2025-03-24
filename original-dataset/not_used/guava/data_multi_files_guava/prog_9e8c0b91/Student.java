import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
