import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class TaskManager {
    private BlockingQueue<Integer> taskQueue = new LinkedBlockingQueue<>();

    public void generateTasks(int count) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            taskQueue.put(random.nextInt(100));
        }
    }

    public void processTasks() throws InterruptedException {
        while (!taskQueue.isEmpty()) {
            int task = taskQueue.take();
            System.out.println("Processing task: " + task);
        }
    }
}
