import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Initialize a map with some values
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        // Use the write method to add a value to the table
        /* write */ table.put("row1", "column1", 42);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        // Simulate complex operations on the table
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);
        
        // Retrieve values from the table using the read method
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Retrieved value: " + value);
        
        // Use the table to perform some additional operations
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Table Cell: Row = " + cell.getRowKey() + ", Column = " + cell.getColumnKey() + ", Value = " + cell.getValue());
        }
        
        // Perform more operations on the map
        map.put("key3", 300);
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key);
        }
    }
}