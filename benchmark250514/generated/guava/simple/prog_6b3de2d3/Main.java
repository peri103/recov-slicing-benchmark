import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize a mutable table builder
        ImmutableTable.Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        /* write */ builder.put("row1", "column1", 42);

        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();

        /* read */ Integer value = table.get("row1", "column1");

        System.out.println(value);
    }
}