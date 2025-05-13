import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a RowSortedTable instance using HashBasedTable
        RowSortedTable<Integer, String, String> table = HashBasedTable.create();

        // Additional complex data structure
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);

        // Write operation: add a value to the table
        /* write */ table.put(1, "column1", "value1");

        // More operations on the map
        map.put("key3", 300);
        if (map.containsKey("key2")) {
            map.remove("key2");
        }
        
        // Print map contents
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        // Read operation: retrieve the value from the table
        /* read */ String value = table.get(1, "column1");

        // Print the value to verify the read operation
        System.out.println("Read from table: " + value);

        // Additional operations on the table
        table.put(2, "column2", "value2");
        table.put(3, "column3", "value3");
        for (Table.Cell<Integer, String, String> cell : table.cellSet()) {
            System.out.println("Table cell: (" + cell.getRowKey() + ", " + cell.getColumnKey() + ") = " + cell.getValue());
        }
    }
}