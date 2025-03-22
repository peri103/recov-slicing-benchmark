import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayBlockingQueue with a capacity of 10
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        
        // Initialize a LinkedBlockingQueue with a capacity of 5
        LinkedBlockingQueue<String> linkedQueue = new LinkedBlockingQueue<>(5);
        
        // Initialize a HashMap to store some data
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        
        try {
            // Write a value to the queue
            /* write */ queue.put(42);
            
            // Simulate some unrelated operations
            linkedQueue.put("Hello");
            linkedQueue.put("World");
            
            // Perform operations with the map
            for (String key : map.keySet()) {
                System.out.println("Map Key: " + key + ", Value: " + map.get(key));
            }
            
            // More unrelated operations
            String firstElement = linkedQueue.take();
            System.out.println("First element from linkedQueue: " + firstElement);
            
            // Final unrelated operation
            linkedQueue.put("Java");
            System.out.println("Another element added to linkedQueue: Java");
            
            // Read the value from the queue
            /* read */ int value = queue.take();
            
            // Print the value to ensure it is the one written
            System.out.println("Value from ArrayBlockingQueue: " + value);
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted
            e.printStackTrace();
        }
    }
}