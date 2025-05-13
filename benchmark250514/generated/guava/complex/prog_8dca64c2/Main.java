import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Use the write method to put a value
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashBasedTable for additional operations
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 100);
        hashTable.put("row3", "column3", 200);

        // Perform some operations on hashTable
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("HashTable Value: " + cell.getValue());
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the read method to get the value
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println("ImmutableTable Value: " + value);

        // Further operations on hashTable
        hashTable.put("row4", "column4", 300);
        hashTable.put("row5", "column5", 400);

        // Print updated hashTable values
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            System.out.println("Updated HashTable Value: " + cell.getValue());
        }
    }
}