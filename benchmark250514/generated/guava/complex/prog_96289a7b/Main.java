import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Define the row and column keys for the table
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableSet<String> columnKeys = ImmutableSet.of("col1", "col2");

        // Create an ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value into the table
        /* write */ table.put("row1", "col1", 42);

        // Initialize a HashMap for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform operations on the HashMap
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in map: " + sum);

        // Add more values to the table for complexity
        table.put("row1", "col2", 84);
        table.put("row2", "col1", 126);
        table.put("row2", "col2", 168);

        // Perform calculations using values from the table
        int product = table.get("row1", "col2") * table.get("row2", "col1");
        System.out.println("Product of selected values in table: " + product);

        // Read the original value from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value to verify it was correctly written and read
        System.out.println("Value from original write-read pair: " + value);

        // Further operations on the table for complexity
        int total = 0;
        for (String row : rowKeys) {
            for (String col : columnKeys) {
                total += table.get(row, col);
            }
        }
        System.out.println("Total of all values in table: " + total);
    }
}