import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Define the row and column keys for the ArrayTable
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableList<String> columnKeys = ImmutableList.of("column1");

        // Create the ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value to the ArrayTable
        /* write */ table.put("row1", "column1", 42);

        // Read the value from the ArrayTable
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value to confirm it was read correctly
        System.out.println(value);
    }
}