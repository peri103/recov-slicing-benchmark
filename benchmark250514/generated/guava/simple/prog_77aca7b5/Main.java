import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Use the put method to add a value
        /* write */ builder.put("row1", "column1", 42);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Use the get method to retrieve the value
        /* read */ Integer value = table.get("row1", "column1");

        // Print the retrieved value
        System.out.println(value);
    }
}