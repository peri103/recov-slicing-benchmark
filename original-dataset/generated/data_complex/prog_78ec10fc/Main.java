import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialize the BlockingQueue
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            List<Integer> list = new ArrayList<>();

            // Add some elements to the list
            for (int i = 0; i < 5; i++) {
                list.add(i * 10);
            }

            // Perform operations on the list
            for (int i = 0; i < list.size(); i++) {
                queue.put(list.get(i));
            }

            // Insert an unrelated operation
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            System.out.println("Sum of list elements: " + sum);

            // Perform some operations before the original read
            BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
            stringQueue.put("Hello");
            stringQueue.put("World");
            String firstString = stringQueue.take();
            System.out.println("First string from stringQueue: " + firstString);

            // Original write operation
            /* write */ queue.put(42);

            // Perform more operations
            for (int i = 0; i < 3; i++) {
                stringQueue.put("Message " + i);
            }
            String secondString = stringQueue.take();
            System.out.println("Second string from stringQueue: " + secondString);

            // Original read operation
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);

            // Additional operations
            for (int i = 0; i < list.size(); i++) {
                System.out.println("List element: " + list.get(i));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}