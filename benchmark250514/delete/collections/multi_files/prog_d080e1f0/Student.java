import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
