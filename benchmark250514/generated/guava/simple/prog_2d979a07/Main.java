import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeBasedTable
        Table<Integer, Integer, String> table = TreeBasedTable.create();
        
        // Write a value into the table
        /* write */ table.put(1, 1, "Hello World");
        
        // Read the value from the table
        /* read */ String value = table.get(1, 1);
        
        // Print the value
        System.out.println(value);
    }
}