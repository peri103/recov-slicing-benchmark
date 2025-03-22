import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        List<String> stringList = new ArrayList<>();

        // Using another BlockingQueue to add complexity
        try {
            queue.put("Hello");
            queue.put("World");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Adding elements to an ArrayList
        stringList.add("First");
        stringList.add("Second");

        // Adding a delay to simulate complex processing
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Processing elements from the queue
        while (!queue.isEmpty()) {
            try {
                String element = queue.take();
                System.out.println("Queue Element: " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Adding elements to the deque
        /* write */ 
        deque.addLast(42);
        
        // Processing elements from the ArrayList
        for (String s : stringList) {
            System.out.println("List Element: " + s);
        }

        // More complex logic before reading from the deque
        for (int i = 0; i < 3; i++) {
            try {
                deque.addLast(i * 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Adding a delay to simulate further processing
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reading from the deque
        try {
            /* read */ 
            int value = deque.takeLast();
            System.out.println("Deque Value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}