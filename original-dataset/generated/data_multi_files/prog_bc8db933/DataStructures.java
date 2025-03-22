import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class DataStructures {
    private ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    public void populateQueue() {
        for (int i = 0; i < 5; i++) {
            queue.add(i * 10);
        }
    }

    public void transferQueueToDeque(DequeOperations dequeOps) {
        while (!queue.isEmpty()) {
            dequeOps.addElement(queue.poll());
        }
    }

    public void populateMap() {
        map.put("first", 1);
        map.put("second", 2);
        map.computeIfPresent("first", (key, val) -> val + 10);
        map.computeIfAbsent("third", key -> 3);
    }

    public void displayMapContents() {
        map.forEach((key, val) -> System.out.println(key + ": " + val));
    }
}
