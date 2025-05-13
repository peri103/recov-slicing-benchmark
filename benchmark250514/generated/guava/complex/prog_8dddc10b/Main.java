import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableList<String> columnKeys = ImmutableList.of("col1", "col2");

        // Create ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Additional operations using HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform some operations on the map
        int mapValue = map.get("key1");
        System.out.println("Value from map: " + mapValue);

        // Write value into the table
        /* write */ table.put("row1", "col1", 42);

        // More operations with ArrayTable
        table.put("row2", "col2", 84);
        int anotherValue = table.get("row2", "col2");
        System.out.println("Another value from table: " + anotherValue);

        // Perform calculations
        int sum = mapValue + anotherValue;
        System.out.println("Sum of values: " + sum);

        // Read value from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value
        System.out.println("Value from table: " + value);

        // Additional logic to manipulate data
        for (String rowKey : rowKeys) {
            for (String columnKey : columnKeys) {
                Integer cellValue = table.get(rowKey, columnKey);
                if (cellValue != null) {
                    System.out.println("Cell (" + rowKey + ", " + columnKey + "): " + cellValue);
                }
            }
        }
    }
}