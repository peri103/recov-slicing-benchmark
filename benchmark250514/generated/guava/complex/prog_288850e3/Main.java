import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Add an entry to the table
        /* write */ builder.put("row1", "column1", 42);

        // Create another table using HashBasedTable
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", "value1");
        hashTable.put("row3", "column3", "value2");

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Create a map to store some data
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key1", "data1");
        dataMap.put("key2", "data2");

        // Perform some operations on the map
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform operations on the hashTable
        for (Table.Cell<String, String, String> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Output the value
        System.out.println(value);

        // More operations on the hashTable
        if (hashTable.contains("row2", "column2")) {
            System.out.println("HashTable contains row2, column2");
        }

        // Additional logic to manipulate data
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}