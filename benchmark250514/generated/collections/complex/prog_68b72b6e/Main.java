import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(5);
        ArrayList<Integer> list = new ArrayList<>();
        
        // Adding elements to the list
        for (int i = 0; i < 10; i++) {
            list.add(i * 10);
        }
        
        // Process elements in the list
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        
        System.out.println("Sum of list elements: " + sum);
        
        // Add element to queue
        /* write */ queue.add(42);
        
        // Perform operations on the list
        list.removeIf(n -> n % 20 == 0);
        System.out.println("Filtered list: " + list);
        
        // Peek element from queue
        /* read */ int value = queue.peek();
        System.out.println("Peeked value from queue: " + value);
        
        // Further operations on the list
        list.add(value);
        list.sort(null);
        System.out.println("Sorted list after adding peeked value: " + list);
    }
}