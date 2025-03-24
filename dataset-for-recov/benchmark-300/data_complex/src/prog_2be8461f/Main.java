import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Add elements to the linked list
        for (int i = 0; i < 3; i++) {
            linkedList.add(i * 5);
        }

        // Write to the deque
        /* write */ deque.addFirst(42);

        // Process the list and linked list
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Read from the deque
        /* read */ int value = deque.getFirst();

        // Print the value read from the deque
        System.out.println("Value from deque: " + value);

        // Print the linked list
        System.out.println("Linked list after processing:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
    }
}