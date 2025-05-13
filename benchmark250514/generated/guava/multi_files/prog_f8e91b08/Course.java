import com.google.common.collect.ArrayListMultimap;

public class Course {
    private String courseName;
    private ArrayListMultimap<String, Integer> studentScores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.studentScores = ArrayListMultimap.create();
    }

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Integer getStudentScore(String studentName) {
        /* read */ return studentScores.get(studentName).get(0);
    }

    public String getCourseName() {
        return courseName;
    }
}
