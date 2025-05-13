import com.google.common.collect.ImmutableTable;

public class Main {
    public static void main(String[] args) {
        // Create an immutable table with a single entry using the 'of' method
        /* write */ ImmutableTable<String, String, Integer> table = ImmutableTable.of("row1", "column1", 42);

        // Read the value from the table using the 'get' method
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println(value);
    }
}