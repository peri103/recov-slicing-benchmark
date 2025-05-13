import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public String getCourseName() {
        return courseName;
    }
}
