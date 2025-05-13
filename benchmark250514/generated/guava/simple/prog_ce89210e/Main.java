import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableSet<String> columnKeys = ImmutableSet.of("col1");

        // Create an ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value to the table
        /* write */ table.put("row1", "col1", 42);

        // Read the value back from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value to verify it matches what was written
        System.out.println(value);
    }
}