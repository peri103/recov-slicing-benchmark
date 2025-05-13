import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Integer> scores = new ArrayList<>();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);
    }
}
