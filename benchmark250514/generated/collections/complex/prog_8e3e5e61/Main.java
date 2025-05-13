import org.apache.commons.collections4.list.NodeCachingLinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the NodeCachingLinkedList
        NodeCachingLinkedList list = new NodeCachingLinkedList();
        
        // Initialize an ArrayList for additional complexity
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Process numbers and add their string representation to the NodeCachingLinkedList
        for (Integer number : numbers) {
            list.add("Number: " + number);
        }

        // Write a value to the list
        /* write */ list.add("Hello, World!");

        // Perform some operations with the ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the value from the list
        /* read */ String value = (String) list.get(5);

        // Print the value to verify correctness
        System.out.println(value);

        // Additional operations for complexity
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
    }
}