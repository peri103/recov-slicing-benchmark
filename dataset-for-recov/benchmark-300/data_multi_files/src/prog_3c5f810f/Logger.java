import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Logger {
    private BlockingQueue<String> logQueue = new LinkedBlockingQueue<>(5);

    public void log(String message) throws InterruptedException {
        logQueue.put(message);
    }

    public void printLogs() throws InterruptedException {
        while (!logQueue.isEmpty()) {
            System.out.println(logQueue.take());
        }
    }
}
