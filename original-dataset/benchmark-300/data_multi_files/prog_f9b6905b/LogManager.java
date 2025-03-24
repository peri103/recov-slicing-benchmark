import java.util.concurrent.ConcurrentLinkedQueue;

public class LogManager {
    private ConcurrentLinkedQueue<String> logQueue = new ConcurrentLinkedQueue<>();

    public void log(String message) {
        logQueue.offer(message);
    }

    public void printLogs() {
        while (!logQueue.isEmpty()) {
            System.out.println(logQueue.poll());
        }
    }
}
