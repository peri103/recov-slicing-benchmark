import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.TreeBasedTable;

public class Main {
    public static void main(String[] args) {
        // Initialize a RowSortedTable
        RowSortedTable<Integer, String, String> table = TreeBasedTable.create();

        // Write a value using the put method
        /* write */ table.put(1, "key", "value");

        // Read the value using the get method
        /* read */ String value = table.get(1, "key");

        // Print the read value
        System.out.println(value);
    }
}