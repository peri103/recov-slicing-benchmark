import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableTable
        ImmutableTable.Builder<String, String, Integer> builder = ImmutableTable.builder();
        
        // Create a HashBasedTable for additional operations
        Table<String, String, Integer> hashTable = HashBasedTable.create();
        
        // Add elements to the HashBasedTable
        hashTable.put("rowA", "columnA", 100);
        hashTable.put("rowB", "columnB", 200);
        
        // Perform some operations on HashBasedTable
        Integer hashTableValue = hashTable.get("rowA", "columnA");
        System.out.println("HashTable Value: " + hashTableValue);
        
        // Use ImmutableList for more complexity
        ImmutableList<String> immutableList = ImmutableList.of("first", "second", "third");
        
        // Loop through ImmutableList and print elements
        for (String element : immutableList) {
            System.out.println("ImmutableList Element: " + element);
        }
        
        // Create an ArrayList and perform operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }
        
        // Print elements from ArrayList
        for (Integer num : arrayList) {
            System.out.println("ArrayList Element: " + num);
        }
        
        /* write */
        builder.put("row1", "column1", 42);
        
        // Build the ImmutableTable
        ImmutableTable<String, String, Integer> table = builder.build();
        
        // Perform operations before reading
        if (table.contains("row1", "column1")) {
            System.out.println("Table contains the specified key.");
        }
        
        /* read */
        Integer value = table.get("row1", "column1");
        
        // Print the value
        System.out.println("ImmutableTable Value: " + value);
        
        // Additional operations after reading
        hashTable.put("rowC", "columnC", 300);
        System.out.println("HashTable Updated Value: " + hashTable.get("rowC", "columnC"));
    }
}