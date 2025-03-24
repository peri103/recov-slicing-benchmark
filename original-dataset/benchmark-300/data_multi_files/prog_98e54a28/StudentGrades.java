import java.util.TreeSet;

public class StudentGrades {
    private TreeSet<Integer> grades = new TreeSet<>();

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public TreeSet<Integer> getGrades() {
        return grades;
    }
}
