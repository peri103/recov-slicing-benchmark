import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Double> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public String getCourseName() {
        return courseName;
    }
}