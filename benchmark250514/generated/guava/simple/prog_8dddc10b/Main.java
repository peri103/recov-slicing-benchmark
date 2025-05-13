import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        ImmutableList<String> rowKeys = ImmutableList.of("row1");
        ImmutableList<String> columnKeys = ImmutableList.of("col1");

        // Create ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write value into the table
        /* write */ table.put("row1", "col1", 42);

        // Read value from the table
        /* read */ int value = table.get("row1", "col1");

        // Print the value
        System.out.println(value);
    }
}