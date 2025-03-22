import java.util.SortedMap;
import java.util.TreeMap;

public class Course {
    private String courseName;
    private SortedMap<String, Integer> studentGrades = new TreeMap<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentGrade(String studentName, int grade) {
        /* write */ studentGrades.put(studentName, grade);
    }

    public int getStudentGrade(String studentName) {
        /* read */ return studentGrades.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
