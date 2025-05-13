import com.google.common.collect.ImmutableTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Create a HashMap to store some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Create a HashBasedTable and populate it with some values
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row1", "col1", 10);
        hashTable.put("row2", "col2", 20);

        // Write a value to the builder
        /* write */ builder.put("rowKey", "columnKey", 42);

        // Manipulate the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map key: " + entry.getKey() + ", value: " + entry.getValue());
            hashTable.put(entry.getKey(), "col3", entry.getValue());
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform operations on the HashBasedTable
        Integer hashTableValue = hashTable.get("row1", "col1");
        System.out.println("HashTable value: " + hashTableValue);

        // Read the value from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");

        // Print the value
        System.out.println("ImmutableTable value: " + value);

        // Additional operations on the HashMap
        map.put("key3", 300);
        for (String key : map.keySet()) {
            System.out.println("Updated Map key: " + key + ", value: " + map.get(key));
        }
    }
}