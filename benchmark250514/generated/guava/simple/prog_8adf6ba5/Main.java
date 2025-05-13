import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeBasedTable
        Table<String, String, Integer> table = TreeBasedTable.create();
        
        // Write a value to the table
        /* write */ table.put("row1", "column1", 42);
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value to ensure correctness
        System.out.println(value);
    }
}