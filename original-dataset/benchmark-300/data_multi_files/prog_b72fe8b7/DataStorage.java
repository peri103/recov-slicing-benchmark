import java.util.concurrent.ConcurrentLinkedDeque;

public class DataStorage {
    private ConcurrentLinkedDeque<Integer> dataQueue = new ConcurrentLinkedDeque<>();

    public void storeData(int value) {
        /* write */ dataQueue.addFirst(value);
    }

    public ConcurrentLinkedDeque<Integer> getDataQueue() {
        return dataQueue;
    }
}
