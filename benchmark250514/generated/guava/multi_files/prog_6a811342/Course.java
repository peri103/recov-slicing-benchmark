import com.google.common.collect.TreeMultiset;

public class Course {
    private String courseName;
    private TreeMultiset<Integer> grades;

    public Course(String courseName) {
        this.courseName = courseName;
        this.grades = TreeMultiset.create();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public int getGradeCount(int grade) {
        /* read */ return grades.count(grade);
    }
}
