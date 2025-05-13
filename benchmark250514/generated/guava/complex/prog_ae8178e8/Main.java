import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Use the write method to add an entry to the table
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashBasedTable for additional operations
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 84);
        hashTable.put("row3", "column3", 126);

        // Perform some operations on the hashTable
        if (hashTable.contains("row2", "column2")) {
            int val = hashTable.get("row2", "column2");
            System.out.println("Value in hashTable at row2, column2: " + val);
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use the read method to retrieve the value
        /* read */ Integer value = table.get("row1", "column1");

        // Print the retrieved value
        System.out.println("Value in ImmutableTable at row1, column1: " + value);

        // Further operations on hashTable
        hashTable.put("row4", "column4", 168);
        int newValue = hashTable.get("row4", "column4");
        System.out.println("New value added to hashTable: " + newValue);
    }
}