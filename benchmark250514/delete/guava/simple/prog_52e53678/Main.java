import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a RowSortedTable instance using HashBasedTable which implements RowSortedTable
        RowSortedTable<Integer, String, String> table = HashBasedTable.create();

        // Write a value into the table
        /* write */ table.put(1, "column1", "value1");

        // Read the value from the table
        /* read */ String value = table.get(1, "column1");

        // Output the value
        System.out.println(value);
    }
}