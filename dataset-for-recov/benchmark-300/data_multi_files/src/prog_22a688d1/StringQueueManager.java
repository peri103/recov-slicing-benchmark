import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class StringQueueManager {
    private BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>(5);

    public void addString(String str) throws InterruptedException {
        stringQueue.put(str);
    }

    public String getString() throws InterruptedException {
        return stringQueue.take();
    }
}
