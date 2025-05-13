import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a RowSortedTable using HashBasedTable
        RowSortedTable<String, String, Integer> table = HashBasedTable.create();

        // Put a value in the table
        /* write */ table.put("row1", "column1", 42);

        // Get the value from the table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println(value);
    }
}