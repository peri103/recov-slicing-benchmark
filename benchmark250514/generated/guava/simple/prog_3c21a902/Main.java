import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableList<String> columnKeys = ImmutableList.of("col1");

        // Create an ArrayTable with specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Put a value into the table
        /* write */ table.put("row1", "col1", 42);

        // Get the value from the table
        /* read */ Integer value = table.get("row1", "col1");

        // Print the value
        System.out.println(value);
    }
}