import java.util.concurrent.BlockingQueue;

public class Logger {
    public void logData(BlockingQueue<Integer> queue) throws InterruptedException {
        /* read */ int data = queue.take();
        System.out.println("Logged data: " + data);
    }
}
