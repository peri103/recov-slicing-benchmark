import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the main table
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Initialize a secondary map for additional data
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key2", 20);
        
        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Write to the main table
        /* write */ table.put("rowKey", "columnKey", 42);
        
        // More complex operations
        table.put("rowKey2", "columnKey2", 100);
        table.put("rowKey3", "columnKey3", 200);
        
        // Access and process data from the table
        Integer sum = 0;
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            sum += cell.getValue();
        }
        
        System.out.println("Sum of all values in the table: " + sum);
        
        // Read from the main table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println("Read value: " + value);
        
        // Additional unrelated operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");
        
        for (String key : stringMap.keySet()) {
            System.out.println("Fruit: " + stringMap.get(key));
        }
    }
}