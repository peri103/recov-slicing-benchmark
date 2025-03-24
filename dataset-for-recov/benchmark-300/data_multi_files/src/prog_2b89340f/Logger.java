import java.util.concurrent.LinkedBlockingDeque;

public class Logger {
    private LinkedBlockingDeque<String> logQueue = new LinkedBlockingDeque<>();

    public void log(String message) {
        logQueue.addFirst(message);
    }

    public void printLogs() throws InterruptedException {
        while (!logQueue.isEmpty()) {
            String log = logQueue.takeLast();
            System.out.println("Log: " + log);
        }
    }
}
