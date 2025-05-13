import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Define the row and column keys for the table
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableSet<String> columnKeys = ImmutableSet.of("col1");

        // Create an ArrayTable with the specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value into the table
        /* write */ table.put("row1", "col1", 42);

        // Read the value from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value to verify it was correctly written and read
        System.out.println(value);
    }
}