import java.util.concurrent.ConcurrentHashMap;

public class Course {
    private ConcurrentHashMap<String, String> studentGrades = new ConcurrentHashMap<>();

    public void addStudentGrade(String studentName, String grade) {
        /* write */ studentGrades.putIfAbsent(studentName, grade);
    }

    public String getStudentGrade(String studentName) {
        return studentGrades.get(studentName);
    }
}
