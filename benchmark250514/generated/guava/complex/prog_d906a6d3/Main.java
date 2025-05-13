import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Use the builder to add a value to the table
        /* write */
        builder.put("row1", "column1", 42);
        
        // Build the immutable table
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Create an ImmutableList and add elements to it
        ImmutableList<String> list = ImmutableList.of("apple", "banana", "cherry");
        
        // Print all elements in the ImmutableList
        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        // Create an ImmutableMap and add entries to it
        ImmutableMap<String, Integer> map = ImmutableMap.of("one", 1, "two", 2, "three", 3);
        
        // Print all keys and values in the ImmutableMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the value from the table using the specified method
        /* read */
        Integer value = table.get("row1", "column1");
        
        // Print the value to verify the correctness
        System.out.println("Value from table: " + value);
        
        // Create another ImmutableTable and perform operations
        ImmutableTable.Builder<String, String, String> anotherBuilder = ImmutableTable.builder();
        anotherBuilder.put("row2", "column2", "hello");
        ImmutableTable<String, String, String> anotherTable = anotherBuilder.build();
        String greeting = anotherTable.get("row2", "column2");
        System.out.println("Greeting from another table: " + greeting);
    }
}