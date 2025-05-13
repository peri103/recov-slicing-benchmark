import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LinkedListMultimap
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        
        // Additional Multimap and operations
        ArrayListMultimap<String, String> additionalMultimap = ArrayListMultimap.create();
        additionalMultimap.put("fruit", "apple");
        additionalMultimap.put("fruit", "banana");
        
        // Use the put method to write a value to the multimap
        /* write */ multimap.put("key", 42);
        
        // Perform operations on additionalMultimap
        System.out.println("Fruits:");
        for (String fruit : additionalMultimap.get("fruit")) {
            System.out.println(fruit);
        }
        
        // Additional logic to manipulate data
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Use the get method to read the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);
        
        // Print the value to verify the operation
        System.out.println("Value from LinkedListMultimap: " + value);
        
        // More complex logic
        ArrayListMultimap<Integer, String> numberToWordMap = ArrayListMultimap.create();
        numberToWordMap.put(1, "one");
        numberToWordMap.put(2, "two");
        numberToWordMap.put(3, "three");
        
        System.out.println("Number to words:");
        for (int number : numberToWordMap.keySet()) {
            System.out.println(number + " -> " + numberToWordMap.get(number));
        }
    }
}