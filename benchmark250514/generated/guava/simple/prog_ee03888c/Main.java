import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Add a value to the table using the builder
        /* write */ builder.put("row1", "column1", 42);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}