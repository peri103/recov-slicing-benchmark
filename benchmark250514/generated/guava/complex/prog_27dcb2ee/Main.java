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
        /* write */ builder.put("row1", "column1", 42);
        
        // Create another table using HashBasedTable
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row1", "column1", "value1");
        hashTable.put("row2", "column2", "value2");

        // Process the hashTable
        for (Table.Cell<String, String, String> cell : hashTable.cellSet()) {
            System.out.println("HashTable - Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        // Create a simple map for additional complexity
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("key1", 100);
        simpleMap.put("key2", 200);
        
        // Process the simpleMap
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Map - Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform some operations with the immutable table
        System.out.println("ImmutableTable contains row1, column1: " + table.contains("row1", "column1"));
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Read value from ImmutableTable: " + value);
        
        // Additional operations
        for (String rowKey : table.rowKeySet()) {
            for (String columnKey : table.columnKeySet()) {
                System.out.println("ImmutableTable - Row: " + rowKey + ", Column: " + columnKey + ", Value: " + table.get(rowKey, columnKey));
            }
        }
    }
}