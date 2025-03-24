import java.util.concurrent.LinkedTransferQueue;

public class Logger {
    public void logData(LinkedTransferQueue<Integer> queue) throws InterruptedException {
        /* read */ int data = queue.take();
        System.out.println("Logged data: " + data);
    }
}
