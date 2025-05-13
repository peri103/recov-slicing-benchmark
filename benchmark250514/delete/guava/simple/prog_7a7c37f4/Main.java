import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a RowSortedTable instance using HashBasedTable
        RowSortedTable<Integer, String, String> table = HashBasedTable.create();

        // Write operation: add a value to the table
        /* write */ table.put(1, "column1", "value1");

        // Read operation: retrieve the value from the table
        /* read */ String value = table.get(1, "column1");

        // Print the value to verify the read operation
        System.out.println(value);
    }
}