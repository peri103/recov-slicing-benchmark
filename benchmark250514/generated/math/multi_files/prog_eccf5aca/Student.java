import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
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
