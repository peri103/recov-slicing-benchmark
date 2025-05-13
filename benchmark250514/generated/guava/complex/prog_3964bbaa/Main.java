import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();

        // Add a value to the table
        /* write */ builder.put("row1", "column1", 42);

        // Create a complex data structure using ImmutableList and ImmutableMap
        ImmutableList<String> list = ImmutableList.of("item1", "item2", "item3");
        ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 100, "key2", 200);

        // Perform operations on the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Perform operations on the map
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
            System.out.println("Sum increment: " + sum);
        }

        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Read value from table: " + value);

        // More complex operations
        ImmutableList<Integer> numbers = ImmutableList.of(1, 2, 3, 4, 5);
        int product = 1;
        for (int number : numbers) {
            product *= number;
            System.out.println("Product increment: " + product);
        }
    }
}