import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Use the write method to add an entry to the table
        /* write */ builder.put("row1", "column1", 42);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Use the read method to retrieve the value
        /* read */ Integer value = table.get("row1", "column1");

        // Print the retrieved value
        System.out.println(value);
    }
}