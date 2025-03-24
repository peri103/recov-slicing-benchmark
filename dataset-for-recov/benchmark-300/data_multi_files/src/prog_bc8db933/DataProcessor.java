import java.util.concurrent.ConcurrentLinkedDeque;

public class DataProcessor {
    private ConcurrentLinkedDeque<Integer> dataQueue = new ConcurrentLinkedDeque<>();

    public void processData(int value) {
        /* write */ dataQueue.addLast(value);
    }

    public ConcurrentLinkedDeque<Integer> getDataQueue() {
        return dataQueue;
    }
}
