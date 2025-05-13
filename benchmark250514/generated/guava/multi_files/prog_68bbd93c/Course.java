import com.google.common.collect.HashBiMap;

public class Course {
    private String courseName;
    private HashBiMap<String, Integer> studentScores = HashBiMap.create();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudentScore(String studentName, int score) {
        /* write */ studentScores.put(studentName, score);
    }

    public Integer getStudentScore(String studentName) {
        /* read */ return studentScores.get(studentName);
    }

    public String getCourseName() {
        return courseName;
    }
}
