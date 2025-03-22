import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        // Populate the map with some values
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Add elements to the list
        list.add("Hello");
        list.add("World");

        // Perform some operations on the list
        for (String s : list) {
            System.out.println("List item: " + s);
        }

        // Add an element to the deque
        /* write */ deque.addFirst(42);

        // Perform some operations on the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Add more elements to the deque
        deque.addFirst(84);
        deque.addLast(168);

        // Perform some operations on the deque
        while (!deque.isEmpty()) {
            System.out.println("Deque item: " + deque.removeLast());
        }

        // Insert a delay to simulate complex processing
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Retrieve the first element from the deque
        /* read */ int value = deque.getFirst();
        System.out.println("First value in deque: " + value);
    }
}