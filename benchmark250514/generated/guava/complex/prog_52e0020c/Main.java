import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.HashBasedTable;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<String, String, Integer> table = TreeBasedTable.create();
        
        // Initialize another table for additional operations
        HashBasedTable<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("rowA", "columnA", "Hello");
        hashTable.put("rowB", "columnB", "World");
        
        // Initialize a HashMap for unrelated operations
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Perform operations on hashTable
        String greeting = hashTable.get("rowA", "columnA") + " " + hashTable.get("rowB", "columnB");
        System.out.println("Greeting: " + greeting);
        
        /* write */ table.put("row1", "column1", 42);
        
        // Additional operations on the TreeBasedTable
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);
        
        // Read and process values from TreeBasedTable
        for (String row : table.rowKeySet()) {
            for (String column : table.columnKeySet()) {
                Integer val = table.get(row, column);
                if (val != null) {
                    System.out.println("Value at " + row + ", " + column + ": " + val);
                }
            }
        }
        
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Read value: " + value);
        
        // Further operations on the HashMap
        map.put("key3", 300);
        map.put("key4", 400);
        
        int newSum = 0;
        for (Integer val : map.values()) {
            newSum += val;
        }
        System.out.println("New sum of HashMap values: " + newSum);
    }
}