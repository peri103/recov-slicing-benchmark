import org.apache.commons.collections4.map.MultiKeyMap;

public class Course {
    private String courseName;
    private MultiKeyMap<String, Integer> scores = new MultiKeyMap<>();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(courseName, subject, score);
    }

    public Integer getScore(String subject) {
        return scores.get(courseName, subject);
    }
}
