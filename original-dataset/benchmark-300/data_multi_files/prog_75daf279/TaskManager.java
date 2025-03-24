import java.util.concurrent.DelayQueue;

public class TaskManager {
    private DelayQueue<DelayedElement> taskQueue = new DelayQueue<>();

    public void addTask(DelayedElement task) {
        /* write */ taskQueue.put(task);
    }

    public DelayedElement getNextTask() throws InterruptedException {
        return taskQueue.take();
    }
}
