import java.util.concurrent.SynchronousQueue;

public class QueueManager {
    private SynchronousQueue<Integer> queue = new SynchronousQueue<>();

    public void putValue(int value) throws InterruptedException {
        /* write */ queue.put(value);
        System.out.println("Value " + value + " has been put into the queue.");
    }

    public int takeValue() throws InterruptedException {
        /* read */ int value = queue.take();
        System.out.println("Value " + value + " has been taken from the queue.");
        return value;
    }
}
