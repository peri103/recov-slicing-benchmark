import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MinMaxPriorityQueue
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        
        // Initialize another PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Initialize a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add some elements to the PriorityQueue
        priorityQueue.add(100);
        priorityQueue.add(50);
        priorityQueue.add(200);
        
        // Add some key-value pairs to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        // Perform some operations on the PriorityQueue
        int pqElement = priorityQueue.poll();
        System.out.println("Polled from PriorityQueue: " + pqElement);
        
        // Perform some operations on the HashMap
        String valueFromMap = map.get(2);
        System.out.println("Value from HashMap: " + valueFromMap);
        
        // Write a value to the MinMaxPriorityQueue
        /* write */ queue.add(42);
        
        // Some unrelated computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);
        
        // More operations on PriorityQueue
        priorityQueue.add(300);
        priorityQueue.add(400);
        
        // More operations on HashMap
        map.put(4, "Four");
        map.put(5, "Five");
        
        // Read the value from the MinMaxPriorityQueue
        /* read */ int value = queue.peek();
        
        // Print the value
        System.out.println("Peek from MinMaxPriorityQueue: " + value);
        
        // Additional operations
        int pqElement2 = priorityQueue.poll();
        System.out.println("Polled from PriorityQueue again: " + pqElement2);
        
        String valueFromMap2 = map.get(5);
        System.out.println("Value from HashMap again: " + valueFromMap2);
    }
}