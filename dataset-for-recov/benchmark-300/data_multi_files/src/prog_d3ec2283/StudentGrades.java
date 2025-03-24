import java.util.concurrent.ConcurrentSkipListMap;

public class StudentGrades {
    private ConcurrentSkipListMap<String, Integer> grades = new ConcurrentSkipListMap<>();

    public void addGrade(String subject, int grade) {
        /* write */ grades.put(subject, grade);
    }

    public int getGrade(String subject) {
        return grades.get(subject);
    }
}
