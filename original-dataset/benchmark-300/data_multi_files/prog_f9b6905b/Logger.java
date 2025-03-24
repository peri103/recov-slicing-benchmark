import java.util.concurrent.ConcurrentLinkedQueue;

public class Logger {
    private ConcurrentLinkedQueue<String> logQueue = new ConcurrentLinkedQueue<>();

    public void log(String message) {
        logQueue.offer(message);
    }

    public void processLogs() {
        while (!logQueue.isEmpty()) {
            System.out.println(logQueue.poll());
        }
    }
}
