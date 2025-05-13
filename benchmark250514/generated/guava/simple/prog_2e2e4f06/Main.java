import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Use the write method to put a value in the table
        /* write */ table.put("rowKey", "columnKey", 42);
        
        // Use the read method to get the value from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        
        // Output the value to ensure the read method works correctly
        System.out.println(value);
    }
}