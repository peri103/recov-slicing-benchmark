import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Course {
    private String courseName;
    private MultiValuedMap<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = new ArrayListValuedHashMap<>();
    }

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public MultiValuedMap<String, Integer> getStudentScores() {
        return studentScores;
    }

    public String getCourseName() {
        return courseName;
    }
}