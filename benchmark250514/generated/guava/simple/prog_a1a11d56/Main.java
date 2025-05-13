import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();

        // Write a value to the table using the put method
        /* write */ table.put("row1", "column1", 42);

        // Read the value from the table using the get method
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value to ensure it was written and read correctly
        System.out.println(value);
    }
}