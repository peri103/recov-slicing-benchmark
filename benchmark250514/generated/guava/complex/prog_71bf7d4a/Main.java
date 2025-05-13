import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();

        // Initialize an ArrayListMultimap
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Write a value into the table
        /* write */ table.put("rowKey", "columnKey", 42);

        // Add values to the multimap
        multimap.put("key1", 10);
        multimap.put("key1", 20);
        multimap.put("key2", 30);

        // Perform some operations on multimap
        for (String key : multimap.keySet()) {
            System.out.println("Values for " + key + ": " + multimap.get(key));
        }

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Read the value from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        
        // Print the value
        System.out.println("Value from table: " + value);

        // More operations on multimap
        multimap.put("key3", 40);
        multimap.put("key3", 50);

        for (String key : multimap.keySet()) {
            System.out.println("Updated values for " + key + ": " + multimap.get(key));
        }
    }
}