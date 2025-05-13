import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Build the table with a single entry
        /* write */ ImmutableTable<String, String, Integer> table = builder.put("row1", "column1", 42).build();
        
        // Create a HashBasedTable and populate it with multiple entries
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        hashTable.put("row2", "column2", 100);
        hashTable.put("row3", "column3", 200);
        
        // Perform some operations on the HashBasedTable
        Integer valueFromHashTable = hashTable.get("row2", "column2");
        System.out.println("Value from hashTable: " + valueFromHashTable);
        
        // Create a HashMap and perform operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 500);
        map.put("key2", 600);
        
        Integer valueFromMap = map.get("key1");
        System.out.println("Value from map: " + valueFromMap);
        
        // Perform unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the value from the ImmutableTable
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("Value from ImmutableTable: " + value);
        
        // Further operations with the HashBasedTable
        hashTable.put("row4", "column4", 300);
        Integer anotherValueFromHashTable = hashTable.get("row4", "column4");
        System.out.println("Another value from hashTable: " + anotherValueFromHashTable);
    }
}