import java.util.HashMap;

public class Student {
    private String name;
    private HashMap<String, Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public int getGrade(String course) {
        return grades.getOrDefault(course, 0);
    }

    public String getName() {
        return name;
    }
}