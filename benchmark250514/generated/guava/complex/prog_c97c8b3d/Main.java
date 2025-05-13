import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Use the builder to construct the table
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashBasedTable and populate it
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row1", "column1", "value1");
        hashTable.put("row2", "column2", "value2");

        // Perform operations on the HashBasedTable
        if (hashTable.contains("row1", "column1")) {
            System.out.println("HashTable contains row1 and column1");
        }

        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();

        // Create a list and populate it
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Perform operations on the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item: " + list.get(i));
        }

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println(value);

        // Additional operations on the HashBasedTable
        hashTable.put("row3", "column3", "value3");
        System.out.println("Value at row3, column3: " + hashTable.get("row3", "column3"));
    }
}