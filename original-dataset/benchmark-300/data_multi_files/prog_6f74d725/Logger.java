import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Logger {
    private BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();

    public void log(String message) throws InterruptedException {
        logQueue.put(message);
    }

    public String takeLog() throws InterruptedException {
        return logQueue.take();
    }
}
