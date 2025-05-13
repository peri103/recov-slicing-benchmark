import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Initialize a map to store some data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("Key1", 100);
        dataMap.put("Key2", 200);

        // Create an ImmutableList
        ImmutableList<String> immutableList = ImmutableList.of("Item1", "Item2", "Item3");

        // Iterate over the immutable list and print each item
        for (String item : immutableList) {
            System.out.println("ImmutableList item: " + item);
        }

        // Add some data to the table using the builder
        builder.put("Row1", "Column1", 42);
        builder.put("Row2", "Column2", 84);

        // Access an element from the map
        Integer mapValue = dataMap.get("Key1");
        System.out.println("Value from map: " + mapValue);

        // Build the table using the builder
        /* write */ ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some operations with the map
        dataMap.put("Key3", 300);
        dataMap.remove("Key2");

        // Read the value from the table
        /* read */ Integer value = table.get("Row1", "Column1");

        // Print the value retrieved from the table
        System.out.println("Value from table: " + value);

        // Iterate over the map and print each key-value pair
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}