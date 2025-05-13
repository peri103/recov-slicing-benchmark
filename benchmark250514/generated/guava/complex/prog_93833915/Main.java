import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the table and multimap
        Table<String, String, Integer> table = HashBasedTable.create();
        Multimap<String, String> multimap = ArrayListMultimap.create();
        
        // Put values into the multimap
        multimap.put("key1", "value1");
        multimap.put("key2", "value2");
        multimap.put("key1", "value3");
        
        // Perform operations on multimap
        System.out.println("Multimap values for key1: " + multimap.get("key1"));
        
        // Write to the table
        /* write */ table.put("row1", "column1", 42);
        
        // Additional operations to add complexity
        for (String key : multimap.keySet()) {
            System.out.println("Processing key: " + key);
            for (String value : multimap.get(key)) {
                System.out.println("Processing value: " + value);
            }
        }
        
        // Conditional operation
        if (table.contains("row1", "column1")) {
            System.out.println("Table contains row1 and column1.");
        }
        
        // Read from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the read value
        System.out.println("Read value from table: " + value);
        
        // Modify multimap
        multimap.remove("key1", "value3");
        System.out.println("Multimap values for key1 after removal: " + multimap.get("key1"));
        
        // Final operations
        int sum = 0;
        for (Integer v : table.values()) {
            sum += v;
        }
        System.out.println("Sum of all values in the table: " + sum);
    }
}