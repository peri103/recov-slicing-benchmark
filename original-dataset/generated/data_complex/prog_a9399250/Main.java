import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockingDeque
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

        // Initialize an ArrayList and a HashMap for additional complexity
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the ArrayList
        stringList.add("Hello");
        stringList.add("World");

        // Add elements to the HashMap
        map.put("One", 1);
        map.put("Two", 2);

        // Add first element to the deque
        /* write */
        deque.addFirst(42);

        // Perform operations on ArrayList
        for (String str : stringList) {
            System.out.println("ArrayList element: " + str);
        }

        // Perform operations on HashMap
        for (String key : map.keySet()) {
            System.out.println("HashMap element: " + key + " -> " + map.get(key));
        }

        try {
            // Take first element from the deque
            /* read */
            int value = deque.takeFirst();
            System.out.println("Deque value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations on the deque
        deque.addFirst(84);
        deque.addLast(168);

        try {
            System.out.println("Deque first value: " + deque.takeFirst());
            System.out.println("Deque last value: " + deque.takeLast());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex logic
        for (int i = 0; i < 5; i++) {
            deque.addFirst(i * 10);
        }

        try {
            while (!deque.isEmpty()) {
                System.out.println("Deque element: " + deque.takeFirst());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}