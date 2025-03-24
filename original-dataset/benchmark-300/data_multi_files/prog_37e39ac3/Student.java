import java.util.SortedSet;
import java.util.TreeSet;

public class Student {
    private String name;
    private SortedSet<Integer> grades = new TreeSet<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        /* write */ grades.add(grade);
    }

    public SortedSet<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
