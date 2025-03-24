import java.util.concurrent.ArrayBlockingQueue;
import java.util.Random;

public class TaskManager {
    private ArrayBlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(10);
    private Random random = new Random();

    public void generateTasks() {
        for (int i = 0; i < 5; i++) {
            taskQueue.offer(random.nextInt(100));
        }
    }

    public int processTasks() {
        int sum = 0;
        for (Integer task : taskQueue) {
            sum += task;
        }
        return sum;
    }
}
