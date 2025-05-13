import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        /* write */ builder.put("row1", "column1", 42);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}