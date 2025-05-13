import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Course {
    private String courseName;
    private HashSetValuedHashMap<String, Integer> scores;

    public Course(String courseName) {
        this.courseName = courseName;
        this.scores = new HashSetValuedHashMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(String studentName, int score) {
        /* write */ scores.put(studentName, score);
    }

    public HashSetValuedHashMap<String, Integer> getScores() {
        return scores;
    }
}
