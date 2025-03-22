import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the ConcurrentLinkedDeque
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        
        // Initialize a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        // Initialize a LinkedBlockingQueue
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        
        // Add some elements to the queue
        for (int i = 0; i < 5; i++) {
            queue.add(i * 10);
        }
        
        // Add elements from the queue to the deque
        while (!queue.isEmpty()) {
            /* write */ deque.addLast(queue.poll());
        }
        
        // Add elements to the map
        map.put("first", 1);
        map.put("second", 2);
        
        // Perform some operations on the map
        map.computeIfPresent("first", (key, val) -> val + 10);
        map.computeIfAbsent("third", key -> 3);
        
        // Display map contents
        map.forEach((key, val) -> System.out.println(key + ": " + val));
        
        // Perform some operations on the deque
        deque.addFirst(100);
        deque.addLast(200);
        
        // Iterate over the deque and print each element
        for (Integer num : deque) {
            System.out.println("Deque element: " + num);
        }
        
        // Read the last element of the deque
        /* read */ Integer value = deque.peekLast();
        System.out.println("Peek Last: " + value);
        
        // Add more elements to the deque
        deque.addLast(300);
        deque.addLast(400);
        
        // Remove and print each element from the deque
        while (!deque.isEmpty()) {
            System.out.println("Removed from deque: " + deque.pollFirst());
        }
    }
}