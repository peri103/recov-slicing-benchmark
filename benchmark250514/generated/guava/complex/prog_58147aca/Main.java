import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Some unrelated operations using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        int mapValue = map.get("key1");
        System.out.println("Map value: " + mapValue);
        
        // Use ImmutableMap for a different set of operations
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("A", 1, "B", 2, "C", 3);
        int immutableMapValue = immutableMap.get("B");
        System.out.println("ImmutableMap value: " + immutableMapValue);
        
        // Add entries to the table
        builder.put("row1", "column1", 42);
        builder.put("row2", "column2", 84);
        builder.put("row3", "column3", 126);
        
        // More operations
        int sum = 0;
        for (Integer value : immutableMap.values()) {
            sum += value;
        }
        System.out.println("Sum of ImmutableMap values: " + sum);
        
        // Build the table
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform some calculations
        int doubledValue = immutableMapValue * 2;
        System.out.println("Doubled ImmutableMap value: " + doubledValue);
        
        // Read from the table
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Table value: " + value);
        
        // Additional operations using the table
        Integer anotherValue = table.get("row2", "column2");
        System.out.println("Another table value: " + anotherValue);
    }
}