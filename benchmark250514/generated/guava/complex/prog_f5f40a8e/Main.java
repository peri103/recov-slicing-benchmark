import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Use the builder to add data to the table
        /* write */ builder.put("row1", "column1", 42);
        
        // Create a HashMap and populate it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 100);
        hashMap.put("key2", 200);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        
        // Print the sum of the values in the HashMap
        System.out.println("Sum of HashMap values: " + sum);

        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform some operations with the ImmutableTable
        int tableSum = 0;
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            tableSum += cell.getValue();
        }
        
        // Print the sum of the values in the ImmutableTable
        System.out.println("Sum of ImmutableTable values: " + tableSum);
        
        // Read the value from the table using the get method
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);
    }
}