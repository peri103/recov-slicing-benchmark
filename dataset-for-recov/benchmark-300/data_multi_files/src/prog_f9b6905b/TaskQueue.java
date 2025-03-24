import java.util.concurrent.PriorityBlockingQueue;

public class TaskQueue {
    private PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

    public void addTask(int task) {
        /* write */ queue.offer(task);
    }

    public Integer getTask() {
        return queue.poll();
    }
}
