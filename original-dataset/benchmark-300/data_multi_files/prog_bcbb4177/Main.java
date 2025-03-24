import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(42);
        BlockingDeque<Integer> deque = student.getDataProcessor().getDeque();
        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Student " + student.getName() + " has score: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}