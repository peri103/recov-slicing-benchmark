import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys
        String[] rows = {"row1"};
        String[] columns = {"col1"};

        // Create an ArrayTable with specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(Arrays.asList(rows), Arrays.asList(columns));

        // Use the write method to put a value into the table
        /* write */ table.put("row1", "col1", 42);

        // Use the read method to get the value from the table
        /* read */ Integer value = table.get("row1", "col1");

        // Print the value to verify it was correctly written and read
        System.out.println(value);
    }
}