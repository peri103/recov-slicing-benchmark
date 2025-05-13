import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Define the row and column keys for the ArrayTable
        ImmutableList<String> rowKeys = ImmutableList.of("row1", "row2");
        ImmutableList<String> columnKeys = ImmutableList.of("column1", "column2");

        // Create the ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Create a HashBasedTable for additional operations
        Table<String, String, String> hashTable = HashBasedTable.create();

        // Perform various operations on the HashBasedTable
        hashTable.put("row1", "column1", "Hello");
        hashTable.put("row2", "column2", "World");

        // Write a value to the ArrayTable
        /* write */ table.put("row1", "column1", 42);

        // Perform some unrelated operations
        String greeting = hashTable.get("row1", "column1");
        String target = hashTable.get("row2", "column2");
        System.out.println(greeting + " " + target);

        // More operations on the HashBasedTable
        hashTable.put("row1", "column2", "!");
        String punctuation = hashTable.get("row1", "column2");
        System.out.println(greeting + " " + target + punctuation);

        // Read the value from the ArrayTable
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value to confirm it was read correctly
        System.out.println(value);

        // Additional complex operations
        for (String row : rowKeys) {
            for (String column : columnKeys) {
                Integer entry = table.get(row, column);
                if (entry != null) {
                    System.out.println("Entry at " + row + ", " + column + ": " + entry);
                }
            }
        }
    }
}