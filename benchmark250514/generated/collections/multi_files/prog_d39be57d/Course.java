import org.apache.commons.collections4.map.LinkedMap;

public class Course {
    private String courseName;
    private LinkedMap<String, Integer> scores;

    public Course() {
        scores = new LinkedMap<>();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(String subject, int score) {
        /* write */ scores.put(subject, score);
    }

    public int getScore(String subject) {
        /* read */ return scores.get(subject);
    }
}
