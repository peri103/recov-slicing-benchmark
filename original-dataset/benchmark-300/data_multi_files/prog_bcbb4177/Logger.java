import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Logger {
    private BlockingDeque<String> logQueue = new LinkedBlockingDeque<>();

    public void log(String message) {
        logQueue.addFirst(message);
    }

    public String getLog() throws InterruptedException {
        return logQueue.takeFirst();
    }
}
