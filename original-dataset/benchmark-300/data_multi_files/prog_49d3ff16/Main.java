import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Queue<Integer> queue = new LinkedList<>();
        student.addScore(10);
        queue.add(20);
        queue.add(30);
        while (!queue.isEmpty()) {
            student.addScore(queue.poll());
        }
        for (int i = 0; i < 5; i++) {
            student.addScore(i * 5);
        }
        /* read */ int value = student.getScore();
        System.out.println(value);
    }
}