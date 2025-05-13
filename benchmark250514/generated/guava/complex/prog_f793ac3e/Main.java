import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, String> builder = ImmutableSortedMap.naturalOrder();
        
        // Add a key-value pair to the builder
        /* write */ builder.put("key1", "value1");
        
        // Create a HashMap and fill it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put("key" + i, i * 100);
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, String> map = builder.build();
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Create an ImmutableList and iterate over it
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        for (String item : immutableList) {
            System.out.println("ImmutableList Item: " + item);
        }
        
        // Read the value associated with "key1" from the ImmutableSortedMap
        /* read */ String value = map.get("key1");
        
        // Print the value
        System.out.println("Value from ImmutableSortedMap: " + value);
        
        // Perform additional operations on the HashMap
        if (hashMap.containsKey("key2")) {
            int retrievedValue = hashMap.get("key2");
            System.out.println("Retrieved from HashMap: " + retrievedValue);
        }
    }
}