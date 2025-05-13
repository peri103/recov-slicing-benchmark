import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Course {
    private String courseName;
    private MultiValuedMap<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = new HashSetValuedHashMap<>();
    }

    public void addStudentScore(String studentName, int score) {
        studentScores.put(studentName, score);
    }

    public MultiValuedMap<String, Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}
