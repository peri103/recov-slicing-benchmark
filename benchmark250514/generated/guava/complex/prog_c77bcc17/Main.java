import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        
        /* write */ table.put(1, 1, "Hello, World!");
        
        // Adding elements to the map for additional complexity
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Performing operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional operations on the table
        table.put(2, 2, "Goodbye, World!");
        table.put(3, 3, "Welcome, World!");
        
        // Iterating over the table
        for (Table.Cell<Integer, Integer, String> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        /* read */ String value = table.get(1, 1);
        
        System.out.println(value);
        
        // Further operations unrelated to the table
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Final operations on the table
        table.put(4, 4, "End, World!");
        System.out.println("Final Table Size: " + table.size());
    }
}