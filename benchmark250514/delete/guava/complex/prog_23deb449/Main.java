import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a RowSortedTable using HashBasedTable
        RowSortedTable<String, String, Integer> table = HashBasedTable.create();

        // Put a value in the table
        /* write */ table.put("row1", "column1", 42);

        // Initialize a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform some operations on the map
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }

        // Add more entries to the table
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);

        // Perform operations on the table
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Get the value from the table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println("Retrieved value from table: " + value);

        // Perform additional operations on the map
        map.put("key3", 300);
        map.replace("key2", 250);
        System.out.println("Updated Map:");
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }
    }
}