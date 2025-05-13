import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Write a value to the table
        /* write */ table.put("row1", "column1", 42);
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}