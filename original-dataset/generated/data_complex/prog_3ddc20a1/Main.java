import java.util.concurrent.LinkedBlockingDeque;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        // Adding some initial values to the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Adding elements to the string list
        stringList.add("Hello");
        stringList.add("World");
        
        // Performing operations on the deque
        deque.addFirst(10);
        deque.addFirst(20);
        /* write */ deque.addLast(42);
        
        // Iterating over the map
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Adding more elements to the deque
        deque.addFirst(30);
        deque.addLast(50);
        
        // Performing operations on the string list
        for (String s : stringList) {
            System.out.println("String List Element: " + s);
        }
        
        // Reading from the deque
        try {
            /* read */ int value = deque.takeLast();
            System.out.println("Deque Last Value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional logic to make the program more complex
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);
        
        // Working with the map
        map.put(4, "Four");
        System.out.println("Map Size: " + map.size());
        
        // Final operations
        if (!deque.isEmpty()) {
            System.out.println("Deque is not empty");
        }
    }
}