import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> ages;

    public Student(String name) {
        this.name = name;
        this.ages = new ArrayList<>();
    }

    public void addAge(int age) {
        ages.add(age);
    }

    public List<Integer> getAges() {
        return ages;
    }

    public String getName() {
        return name;
    }
}
