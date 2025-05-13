import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Add a value to the table
        /* write */ builder.put("row1", "column1", 42);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
    }
}