import java.util.concurrent.ConcurrentHashMap;

public class Course {
    private String courseName;
    private ConcurrentHashMap<String, Integer> studentGrades = new ConcurrentHashMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudentGrade(String studentName, int grade) {
        studentGrades.put(studentName, grade);
    }

    public Integer getStudentGrade(String studentName) {
        return studentGrades.get(studentName);
    }
}
