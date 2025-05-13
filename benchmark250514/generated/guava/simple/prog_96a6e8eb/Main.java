import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Use the write method to put a value into the table
        /* write */ table.put("row1", "column1", 42);
        
        // Use the read method to get the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the retrieved value
        System.out.println(value);
    }
}