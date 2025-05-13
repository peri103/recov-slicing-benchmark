import org.apache.commons.collections4.list.TreeList;

public class Course {
    private String courseName;
    private TreeList<Integer> grades;

    public Course() {
        this.courseName = "Computer Science";
        this.grades = new TreeList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.add(0, grade);
    }

    public TreeList<Integer> getGrades() {
        return grades;
    }
}
