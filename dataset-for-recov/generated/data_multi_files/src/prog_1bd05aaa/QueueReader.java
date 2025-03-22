import java.util.concurrent.ArrayBlockingQueue;

public class QueueReader {
    private ArrayBlockingQueue<Integer> queue;

    public QueueReader(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public int readValue() throws InterruptedException {
        /* read */ return queue.take();
    }
}
