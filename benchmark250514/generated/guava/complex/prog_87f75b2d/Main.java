import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Use the builder to add a value
        /* write */ builder.put("row1", "column1", 42);
        
        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Create a HashBasedTable for additional operations
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        
        // Add multiple entries to the hash table
        hashTable.put("row2", "column2", 84);
        hashTable.put("row3", "column3", 126);
        hashTable.put("row4", "column4", 168);
        
        // Perform some operations on the hash table
        if (hashTable.contains("row2", "column2")) {
            int value2 = hashTable.get("row2", "column2");
            System.out.println("Value at row2, column2: " + value2);
        }
        
        // Iterate over entries in the hash table
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        // Read the value from the immutable table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value at row1, column1: " + value);
        
        // Additional logic to make the program more complex
        int sum = 0;
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            sum += cell.getValue();
        }
        System.out.println("Sum of all values in hashTable: " + sum);
    }
}