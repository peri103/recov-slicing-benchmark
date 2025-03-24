import java.util.concurrent.ConcurrentHashMap;

public class StudentGrades {
    private ConcurrentHashMap<String, Integer> grades = new ConcurrentHashMap<>();

    public void addGrade(String subject, int grade) {
        /* write */ grades.putIfAbsent(subject, grade);
    }

    public Integer getGrade(String subject) {
        return grades.get(subject);
    }
}
