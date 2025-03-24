import java.util.List;

public class Student {
    private String name;
    private DequeManager dequeManager = new DequeManager();

    public Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        dequeManager.addToDeque(score);
    }

    public Deque<Integer> getScores() {
        return dequeManager.getDeque();
    }
}
