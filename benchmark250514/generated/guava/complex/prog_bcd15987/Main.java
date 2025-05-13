import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Write a value into the table using the builder
        /* write */ builder.put("row1", "column1", 42);
        
        // Perform some unrelated operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        ImmutableSet<String> set = ImmutableSet.of("A", "B", "C");
        for (String s : set) {
            System.out.println("Set contains: " + s);
        }
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform some more unrelated operations
        map.put("key3", 300);
        System.out.println("Map size: " + map.size());
        
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key);
        }
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);
    }
}