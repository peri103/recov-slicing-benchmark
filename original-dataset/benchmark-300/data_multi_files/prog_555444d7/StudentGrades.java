import java.util.Stack;

public class StudentGrades {
    private Stack<Integer> grades = new Stack<>();

    public void addGrade(int grade) {
        /* write */ grades.push(grade);
    }

    public Stack<Integer> getGrades() {
        return grades;
    }
}
