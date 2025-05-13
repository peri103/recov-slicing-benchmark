import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Add a value to the table using the builder
        /* write */ builder.put("row1", "column1", 42);
        
        // Create a HashBasedTable and add some entries
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", "Hello");
        hashTable.put("row3", "column3", "World");
        
        // Create a map and populate it with values
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Perform operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        
        // Print the sum of values in the map
        System.out.println("Sum of values in map: " + sum);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value in ImmutableTable: " + value);
        
        // Retrieve and print values from the HashBasedTable
        String greeting = hashTable.get("row2", "column2");
        String exclamation = hashTable.get("row3", "column3");
        
        System.out.println(greeting + " " + exclamation);
    }
}