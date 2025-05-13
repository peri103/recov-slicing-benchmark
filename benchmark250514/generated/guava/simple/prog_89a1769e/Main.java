import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Build the table using the builder
        /* write */ ImmutableTable<String, String, Integer> table = builder.put("Row1", "Column1", 42).build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("Row1", "Column1");
        
        // Print the value
        System.out.println(value);
    }
}