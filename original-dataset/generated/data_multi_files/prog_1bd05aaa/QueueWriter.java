import java.util.concurrent.ArrayBlockingQueue;

public class QueueWriter {
    private ArrayBlockingQueue<Integer> queue;

    public QueueWriter(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void writeValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
    }
}
