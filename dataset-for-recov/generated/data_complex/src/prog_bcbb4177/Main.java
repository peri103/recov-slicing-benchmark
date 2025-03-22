import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        /* write */ deque.addFirst(42);
        
        // New code using BlockingQueue
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.add("Hello");
        queue.add("World");
        
        // Processing queue elements
        List<String> processedStrings = new ArrayList<>();
        while (!queue.isEmpty()) {
            try {
                String element = queue.take();
                processedStrings.add(element.toUpperCase());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        // Print results of unrelated computations
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Print processed queue elements
        System.out.println("Processed Strings: " + processedStrings);
        
        // Read operation from original deque
        try {
            /* read */ int value = deque.takeFirst();
            System.out.println("Value from deque: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional logic
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 5);
        }
        
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        
        System.out.println("Product of numbers: " + product);
    }
}