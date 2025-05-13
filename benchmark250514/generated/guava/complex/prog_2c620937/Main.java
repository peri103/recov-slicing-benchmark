import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Write a value into the table
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashMap and populate it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 100);
        hashMap.put("key2", 200);

        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap key: " + key + ", value: " + hashMap.get(key));
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Create another ImmutableTable and perform operations
        ImmutableTable.Builder<String, String, String> builder2 = new ImmutableTable.Builder<>();
        builder2.put("rowA", "columnA", "valueA");
        builder2.put("rowB", "columnB", "valueB");
        ImmutableTable<String, String, String> table2 = builder2.build();

        for (Table.Cell<String, String, String> cell : table2.cellSet()) {
            System.out.println("Table2 cell: (" + cell.getRowKey() + ", " + cell.getColumnKey() + ") = " + cell.getValue());
        }

        // Read the value from the original table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println("Read value from table: " + value);

        // Perform some calculations
        int sum = 0;
        for (Integer val : hashMap.values()) {
            sum += val;
        }
        System.out.println("Sum of HashMap values: " + sum);
    }
}