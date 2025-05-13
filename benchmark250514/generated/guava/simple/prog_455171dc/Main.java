import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Use the write method to put a value into the table
        /* write */ builder.put("row1", "column1", 42);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Use the read method to get the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}