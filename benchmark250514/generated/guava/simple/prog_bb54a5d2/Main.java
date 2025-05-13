import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Build the table with a single entry
        /* write */ ImmutableTable<String, String, Integer> table = builder.put("row1", "column1", 42).build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}