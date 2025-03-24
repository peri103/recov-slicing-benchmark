import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskManager {
    private BlockingQueue<String> taskQueue = new LinkedBlockingQueue<>();

    public void addTask(String task) {
        taskQueue.add(task);
    }

    public BlockingQueue<String> getTaskQueue() {
        return taskQueue;
    }
}
