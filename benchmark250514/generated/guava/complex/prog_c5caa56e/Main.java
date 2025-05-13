import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Add a value to the table using the builder
        /* write */ builder.put("rowKey", "columnKey", 42);
        
        // Create another table using HashBasedTable
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("r1", "c1", "Value1");
        hashTable.put("r2", "c2", "Value2");
        
        // Perform operations with HashBasedTable
        for (Table.Cell<String, String, String> cell : hashTable.cellSet()) {
            System.out.println("HashTable: " + cell.getRowKey() + " " + cell.getColumnKey() + " " + cell.getValue());
        }
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Create a map and perform some operations
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        map.put("key3", 300);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " " + entry.getValue());
        }
        
        // Read the value from the ImmutableTable
        /* read */ Integer value = table.get("rowKey", "columnKey");
        
        // Print the value from the ImmutableTable
        System.out.println("ImmutableTable Value: " + value);
        
        // Perform additional operations
        map.put("key4", value);
        
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        
        System.out.println("Sum of Map Values: " + sum);
    }
}