import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashSetValuedHashMap
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        
        // Use the write method to add a value
        /* write */ map.put("key", 42);
        
        // Use the read method to retrieve the value
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value
        System.out.println(value);
    }
}