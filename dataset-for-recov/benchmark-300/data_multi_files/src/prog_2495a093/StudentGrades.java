import java.util.concurrent.CopyOnWriteArrayList;

public class StudentGrades {
    private CopyOnWriteArrayList<Integer> grades = new CopyOnWriteArrayList<>();

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public CopyOnWriteArrayList<Integer> getGrades() {
        return grades;
    }
}
