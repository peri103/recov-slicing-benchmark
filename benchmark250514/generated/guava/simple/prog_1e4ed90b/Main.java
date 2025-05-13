import com.google.common.collect.LinkedHashMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LinkedHashMultimap
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        
        // Use the write method to put a value into the multimap
        /* write */ multimap.put("key", "value");
        
        // Use the read method to retrieve the value from the multimap
        /* read */ String value = multimap.get("key").iterator().next();
        
        // Print the retrieved value
        System.out.println(value);
    }
}