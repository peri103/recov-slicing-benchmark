import java.util.Vector;

public class StudentGrades {
    private Vector<Integer> grades = new Vector<>();

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public Vector<Integer> getGrades() {
        return grades;
    }
}
