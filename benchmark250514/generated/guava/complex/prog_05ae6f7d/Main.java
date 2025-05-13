import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Add an entry to the table using the builder
        /* write */ builder.put("row1", "column1", 42);
        
        // Create a HashMap to store some data
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Create another ImmutableTable using a different builder pattern
        ImmutableTable.Builder<String, String, String> stringTableBuilder = ImmutableTable.builder();
        stringTableBuilder.put("row2", "column2", "Hello");
        stringTableBuilder.put("row3", "column3", "World");
        ImmutableTable<String, String, String> stringTable = stringTableBuilder.build();
        
        // Read the value from the table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);
        
        // Read and print values from the second ImmutableTable
        System.out.println("String Table Value: " + stringTable.get("row2", "column2"));
        System.out.println("String Table Value: " + stringTable.get("row3", "column3"));
        
        // Perform some calculations and print results
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}