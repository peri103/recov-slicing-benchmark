import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Integer> scores = new ArrayList<>();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addScore(int score) {
        /* write */ scores.add(score);
    }

    public int getScore(int index) {
        return scores.get(index);
    }
}
