import com.google.common.collect.MinMaxPriorityQueue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        /* write */ queue.add(42);

        // Additional data structures for complexity
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put("key1", 10);
        map.put("key2", 20);
        set.add(30);
        set.add(40);

        // Perform operations on map and set
        for (String key : map.keySet()) {
            set.add(map.get(key));
        }

        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }

        // Manipulate the queue further
        queue.add(15);
        queue.add(5);
        queue.add(25);

        // More operations on map
        map.put("key3", 35);
        map.put("key4", 45);

        // Further operations on the queue
        queue.poll();
        queue.add(50);

        // Calculate the average of the set values
        double average = sum / (double) set.size();
        System.out.println("Average: " + average);

        // Retrieve the first element from the queue
        /* read */ int value = queue.peek();
        System.out.println("Peeked value from queue: " + value);

        // Final operations on map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}