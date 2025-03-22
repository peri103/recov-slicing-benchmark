import java.util.Deque;
import java.util.LinkedList;

public class Course {
    private String courseName;
    private Deque<Integer> grades = new LinkedList<>();

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.addLast(grade);
    }

    public String getCourseName() {
        return courseName;
    }

    public int getLatestGrade() {
        /* read */ return grades.getLast();
    }
}
