import com.google.common.collect.LinkedListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LinkedListMultimap
        LinkedListMultimap<String, Integer> multimap = LinkedListMultimap.create();
        
        // Use the put method to write a value to the multimap
        /* write */ multimap.put("key", 42);
        
        // Use the get method to read the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);
        
        // Print the value to verify the operation
        System.out.println(value);
    }
}