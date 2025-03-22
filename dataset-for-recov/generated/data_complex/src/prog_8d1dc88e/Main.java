import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        ArrayBlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(10);
        HashMap<String, Integer> map = new HashMap<>();

        /* write */ queue.offer(42);
        stringQueue.offer("Hello");
        stringQueue.offer("World");
        map.put("Key1", 100);
        map.put("Key2", 200);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Process the string queue
        while (!stringQueue.isEmpty()) {
            String str = stringQueue.poll();
            System.out.println("String from queue: " + str);
        }

        // Add more integers to the priority queue
        for (int i = 1; i <= 5; i++) {
            queue.offer(i * 10);
        }

        // Perform operations on the priority queue
        while (!queue.isEmpty()) {
            /* read */ Integer value = queue.poll();
            System.out.println("Integer from priority queue: " + value);
        }
    }
}