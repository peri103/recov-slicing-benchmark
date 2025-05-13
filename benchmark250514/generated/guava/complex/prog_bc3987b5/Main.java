import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table
        Table<String, String, Integer> table = HashBasedTable.create();

        // Initialize a Multimap
        Multimap<String, Integer> multimap = ArrayListMultimap.create();

        // Populate the Multimap
        multimap.put("key1", 10);
        multimap.put("key1", 20);
        multimap.put("key2", 30);

        // Perform some operations on Multimap
        System.out.println("Values for key1 in multimap: " + multimap.get("key1"));

        // Insert an element into the Table
        /* write */ table.put("row1", "column1", 42);

        // Perform some operations before reading from the Table
        int sum = 0;
        for (Integer value : multimap.values()) {
            sum += value;
        }
        System.out.println("Sum of all values in multimap: " + sum);

        // Add more data to the Table
        table.put("row2", "column1", 100);
        table.put("row1", "column2", 50);

        // Perform some unrelated operations
        int product = 1;
        for (Integer value : multimap.get("key1")) {
            product *= value;
        }
        System.out.println("Product of values for key1 in multimap: " + product);

        // Read the value from the Table
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Read value from table: " + value);

        // Perform more operations on Table
        Integer value2 = table.get("row2", "column1");
        System.out.println("Value at row2, column1 in table: " + value2);
    }
}