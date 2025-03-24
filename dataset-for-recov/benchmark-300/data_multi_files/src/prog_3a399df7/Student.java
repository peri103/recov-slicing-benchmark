import java.util.Hashtable;

public class Student {
    private String name;
    private Hashtable<String, Integer> grades = new Hashtable<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String course, int grade) {
        /* write */ grades.put(course, grade);
    }

    public Hashtable<String, Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
