import java.util.PriorityQueue;

public class TaskQueue {
    private PriorityQueue<Integer> queue = new PriorityQueue<>();

    public void addTask(int task) {
        /* write */ queue.offer(task);
    }

    public int getNextTask() {
        return queue.poll();
    }
}
