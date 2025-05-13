import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        PriorityQueue<Integer> secondaryQueue = new PriorityQueue<>();
        
        // Insert some elements into the secondary queue
        for (int i = 0; i < 5; i++) {
            secondaryQueue.offer(i * 2);
        }
        
        // Perform some operations on secondary queue
        while (!secondaryQueue.isEmpty()) {
            int element = secondaryQueue.poll();
            System.out.println("Processing element from secondary queue: " + element);
        }
        
        // Insert an element into the MinMaxPriorityQueue
        /* write */ queue.offer(10);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        
        // Insert additional elements into the MinMaxPriorityQueue
        for (int i = 20; i <= 50; i += 10) {
            queue.offer(i);
        }
        
        // Retrieve the element from the MinMaxPriorityQueue
        /* read */ Integer value = queue.peek();
        System.out.println("Peeked value from MinMaxPriorityQueue: " + value);
        
        // Process remaining elements in the MinMaxPriorityQueue
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Processing element from MinMaxPriorityQueue: " + element);
        }
    }
}