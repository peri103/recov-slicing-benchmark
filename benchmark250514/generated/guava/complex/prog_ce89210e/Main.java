import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableSet<String> columnKeys = ImmutableSet.of("col1", "col2");

        // Create an ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value to the table
        /* write */ table.put("row1", "col1", 42);

        // Additional operations to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Insert more values into the table
        table.put("row1", "col2", 84);
        table.put("row2", "col1", 126);
        table.put("row2", "col2", 168);

        // Calculate the sum of all values in the table
        int sum = 0;
        for (String row : rowKeys) {
            for (String col : columnKeys) {
                sum += table.get(row, col);
            }
        }
        System.out.println("Sum of all values in the table: " + sum);

        // Read the value back from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value to verify it matches what was written
        System.out.println("Read value: " + value);

        // Perform additional calculations
        int product = 1;
        for (Integer val : map.values()) {
            product *= val;
        }
        System.out.println("Product of all values in the map: " + product);
    }
}