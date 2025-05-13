import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys for the ArrayTable
        List<String> rowKeys = new ArrayList<>();
        rowKeys.add("row1");
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("column1");

        // Create the ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        // Write a value into the table
        /* write */ table.put("row1", "column1", 42);

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println(value);
    }
}