import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Use the builder to add a single entry to the table
        /* write */ builder.put("row1", "column1", 42);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}