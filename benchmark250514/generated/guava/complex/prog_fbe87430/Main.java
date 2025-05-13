import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableTable.Builder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        Builder<String, String, Integer> builder = new ImmutableTable.Builder<>();

        // Write operation
        /* write */ builder.put("row1", "column1", 42);

        // Create a HashBasedTable for additional operations
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", "value1");
        hashTable.put("row3", "column3", "value2");

        // Perform operations on HashBasedTable
        String valueFromHashTable = hashTable.get("row2", "column2");
        System.out.println("HashTable Value: " + valueFromHashTable);

        // Create a HashMap for unrelated operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        // Iterate over HashMap and perform operations
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read operation
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value
        System.out.println("ImmutableTable Value: " + value);

        // Perform additional operations with HashBasedTable
        hashTable.put("row4", "column4", "value3");
        String anotherValueFromHashTable = hashTable.get("row3", "column3");
        System.out.println("Another HashTable Value: " + anotherValueFromHashTable);
    }
}