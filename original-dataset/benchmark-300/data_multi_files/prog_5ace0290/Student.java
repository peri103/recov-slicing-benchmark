import java.util.HashSet;
import java.util.Random;

public class Student {
    private String name;
    private HashSet<Integer> scores = new HashSet<>();
    private Random random = new Random();

    public Student(String name) {
        this.name = name;
    }

    public void generateScores() {
        for (int i = 0; i < 10; i++) {
            scores.add(random.nextInt(100));
        }
    }

    public HashSet<Integer> getScores() {
        return scores;
    }

    public String getName() {
        return name;
    }
}
