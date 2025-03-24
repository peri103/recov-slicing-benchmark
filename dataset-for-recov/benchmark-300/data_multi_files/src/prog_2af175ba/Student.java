import java.util.List;
import java.util.ArrayList;

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

    public String getName() {
        return name;
    }
}
