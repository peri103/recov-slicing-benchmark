import java.util.concurrent.LinkedTransferQueue;

public class StringQueueManager {
    private LinkedTransferQueue<String> stringQueue = new LinkedTransferQueue<>();

    public void addToStringQueue(String value) {
        stringQueue.offer(value);
    }

    public String getFromStringQueue() {
        return stringQueue.poll();
    }
}
