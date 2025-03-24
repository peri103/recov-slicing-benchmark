import java.util.HashSet;
import java.util.Random;

public class Student {
    private String name;
    private HashSet<Integer> grades = new HashSet<>();
    private Random random = new Random();

    public Student(String name) {
        this.name = name;
    }

    public void addRandomGrades(int count) {
        for (int i = 0; i < count; i++) {
            grades.add(random.nextInt(100));
        }
    }

    public HashSet<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
