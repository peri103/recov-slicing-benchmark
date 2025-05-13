import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a RowSortedTable using HashBasedTable
        RowSortedTable<String, String, Integer> table = HashBasedTable.create();

        // Use the put method to write a value into the table
        /* write */ table.put("row1", "column1", 42);

        // Use the get method to read the value from the table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}