import com.google.common.collect.MinMaxPriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the MinMaxPriorityQueue
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        
        // Write a value to the queue
        /* write */ queue.add(42);
        
        // Read the value from the queue
        /* read */ int value = queue.peek();
        
        // Print the value
        System.out.println(value);
    }
}