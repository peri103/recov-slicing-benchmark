import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Initialize a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        
        // Use the write method to put a value in the table
        /* write */ table.put("rowKey", "columnKey", 42);

        // Add multiple entries to the HashMap
        map.put("key1", 10);
        map.put("key2", 20);
        map.put("key3", 30);
        
        // Perform operations with the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Perform some calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Use the read method to get the value from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        
        // Output the value to ensure the read method works correctly
        System.out.println("Value from table: " + value);
        
        // Further operations with the table
        table.put("rowKey2", "columnKey2", 100);
        table.put("rowKey3", "columnKey3", 200);
        
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        // Additional calculations
        int product = 1;
        for (Integer val : table.values()) {
            product *= val;
        }
        System.out.println("Product of values in table: " + product);
    }
}