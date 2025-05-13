import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Use the builder to add a value
        /* write */ builder.put("row1", "column1", 42);
        
        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Read the value from the immutable table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}