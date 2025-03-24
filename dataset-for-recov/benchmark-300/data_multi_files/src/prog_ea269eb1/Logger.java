import java.util.concurrent.BlockingQueue;

public class Logger {
    private BlockingQueue<String> logQueue;

    public Logger(BlockingQueue<String> logQueue) {
        this.logQueue = logQueue;
    }

    public void log(String message) throws InterruptedException {
        logQueue.put(message);
    }

    public String getLog() throws InterruptedException {
        return logQueue.take();
    }
}
