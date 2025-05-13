import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Double> grades = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return grades;
    }
}
