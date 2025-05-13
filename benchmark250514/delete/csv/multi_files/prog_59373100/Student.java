import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<String> subjects = new ArrayList<>();
    private HashMap<String, Integer> grades = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void setGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void printGrades() {
        for (String subject : subjects) {
            System.out.println(subject + ": " + grades.getOrDefault(subject, 0));
        }
    }
}
