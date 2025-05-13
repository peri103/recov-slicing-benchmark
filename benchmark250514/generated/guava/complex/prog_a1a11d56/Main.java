import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Create and initialize an ArrayList
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        // Create and initialize a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Write a value to the table using the put method
        /* write */ table.put("row1", "column1", 42);
        
        // Manipulate the ArrayList
        list.add("Guava");
        list.remove(0);
        
        // Manipulate the HashMap
        map.put("key3", 300);
        map.remove("key1");
        
        // Perform some operations on the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Read the value from the table using the get method
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value to ensure it was written and read correctly
        System.out.println("Table value: " + value);
        
        // Further manipulate the list and map
        list.clear();
        map.clear();
        
        // Verify the list and map are empty
        System.out.println("List is empty: " + list.isEmpty());
        System.out.println("Map is empty: " + map.isEmpty());
    }
}