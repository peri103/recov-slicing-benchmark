import org.apache.commons.collections4.buffer.CircularFifoBuffer;
import org.apache.commons.collections4.queue.CircularFifoQueue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CircularFifoBuffer buffer = new CircularFifoBuffer(10); // Initialize buffer with a capacity of 10
        CircularFifoQueue queue = new CircularFifoQueue(5); // Initialize another FIFO structure with a capacity of 5
        ArrayList<Integer> numbers = new ArrayList<>(); // Initialize an ArrayList to store numbers

        // Add elements to the queue
        for (int i = 0; i < 5; i++) {
            queue.add(i * 10);
        }

        // Process elements in the queue and add to the ArrayList
        for (Object num : queue) {
            numbers.add((Integer) num);
        }

        // Perform some calculations with the elements in the ArrayList
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers in ArrayList: " + sum);

        /* write */ buffer.add(42); // Add an element to the buffer

        // Further operations with the buffer and queue
        if (!queue.isEmpty()) {
            queue.add(queue.remove() + 20);
        }

        // Retrieve and print elements from the queue
        for (Object num : queue) {
            System.out.println("Queue element: " + num);
        }

        /* read */ Object value = buffer.get(); // Retrieve the element from the buffer
        System.out.println("Retrieved value from buffer: " + value); // Print the retrieved value

        // Additional calculations with the buffer and ArrayList
        if (!numbers.isEmpty()) {
            buffer.add(numbers.get(0) + 5);
        }

        // Print elements from the buffer
        while (!buffer.isEmpty()) {
            System.out.println("Buffer element: " + buffer.remove());
        }
    }
}