import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a RowSortedTable
        RowSortedTable<Integer, String, String> table = TreeBasedTable.create();

        // Initialize another table for additional complexity
        Table<Integer, String, String> additionalTable = HashBasedTable.create();

        // Write a value using the put method in the original table
        /* write */ table.put(1, "key", "value");

        // Perform some unrelated operations
        for (int i = 2; i <= 5; i++) {
            additionalTable.put(i, "key" + i, "value" + i);
        }

        // Manipulate the original table further
        table.put(2, "anotherKey", "anotherValue");
        additionalTable.put(1, "key", "overwrittenValue");

        // Print all entries in the additional table
        for (Table.Cell<Integer, String, String> cell : additionalTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Read the value using the get method from the original table
        /* read */ String value = table.get(1, "key");

        // Print the read value
        System.out.println("Read value from original table: " + value);

        // Additional logic to make the program more complex
        for (int i = 1; i <= 5; i++) {
            String retrievedValue = additionalTable.get(i, "key" + i);
            if (retrievedValue != null) {
                System.out.println("Retrieved from additional table: " + retrievedValue);
            }
        }

        // Further manipulation of the original table
        table.put(3, "yetAnotherKey", "yetAnotherValue");
        table.put(4, "someKey", "someValue");

        // Print all entries in the original table
        for (Table.Cell<Integer, String, String> cell : table.cellSet()) {
            System.out.println("Original Table - Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
    }
}