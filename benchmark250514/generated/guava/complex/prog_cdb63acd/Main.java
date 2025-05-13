import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create an ImmutableMap using ImmutableMap.Builder
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key", 42);
        
        // Step 2: Create another collection for additional operations
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("value1");
        listBuilder.add("value2");
        ImmutableList<String> list = listBuilder.build();
        
        // Step 3: Perform operations on a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        // Step 4: Iterate over the list and print values
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        // Step 5: Access the ImmutableMap and perform a read operation
        ImmutableMap<String, Integer> map = builder.build();
        /* read */ Integer value = map.get("key");
        
        // Step 6: Print the value obtained from the ImmutableMap
        System.out.println("Value from ImmutableMap: " + value);
        
        // Step 7: Iterate over the HashMap and print key-value pairs
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}