import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys for ArrayTable
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableList<String> columnKeys = ImmutableList.of("col1", "col2");

        // Create an ArrayTable with specified row and column keys
        ArrayTable<String, String, Integer> arrayTable = ArrayTable.create(rowKeys, columnKeys);

        // Put a value into the arrayTable
        /* write */ arrayTable.put("row1", "col1", 42);

        // Initialize a HashBasedTable
        Table<String, String, String> hashBasedTable = HashBasedTable.create();
        hashBasedTable.put("A", "B", "Value1");
        hashBasedTable.put("C", "D", "Value2");

        // Manipulate HashBasedTable
        String valueFromHashBasedTable = hashBasedTable.get("A", "B");
        System.out.println("Value from HashBasedTable: " + valueFromHashBasedTable);

        // Create a simple map for additional complexity
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("Key1", 100);
        simpleMap.put("Key2", 200);
        simpleMap.put("Key3", 300);

        // Iterate over map entries
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some arithmetic operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum + ", Product: " + product);

        // Get the value from the arrayTable
        /* read */ Integer valueFromArrayTable = arrayTable.get("row1", "col1");

        // Print the value from ArrayTable
        System.out.println("Value from ArrayTable: " + valueFromArrayTable);

        // Additional loop for complexity
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}