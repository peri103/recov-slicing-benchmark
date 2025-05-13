import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Write a value to the builder
        /* write */ builder.put("rowKey", "columnKey", 42);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        
        // Print the value
        System.out.println(value);
    }
}