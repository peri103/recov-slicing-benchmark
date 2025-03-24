import java.util.HashMap;

public class StudentGrades {
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addGrade(String subject, int grade) {
        /* write */ grades.put(subject, grade);
    }

    public HashMap<String, Integer> getGrades() {
        return grades;
    }
}
