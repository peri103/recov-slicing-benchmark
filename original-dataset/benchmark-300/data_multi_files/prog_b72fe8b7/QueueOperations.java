import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;

public class QueueOperations {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public void addRandomElements(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            queue.add(random.nextInt(100));
        }
    }

    public void processElements() {
        while (!queue.isEmpty()) {
            System.out.println("Processing element: " + queue.poll());
        }
    }
}
