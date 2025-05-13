import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<String, String, Integer> table = TreeBasedTable.create();
        HashMap<String, Integer> additionalMap = new HashMap<>();
        
        /* write */ table.put("row1", "column1", 42);
        
        // Adding more complexity with additionalMap
        additionalMap.put("key1", 100);
        additionalMap.put("key2", 200);
        
        // Perform some operations on additionalMap
        int sum = 0;
        for (String key : additionalMap.keySet()) {
            sum += additionalMap.get(key);
        }
        
        System.out.println("Sum of values in additionalMap: " + sum);
        
        // Further logic using table
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);
        
        // Print all values in the table
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println("Retrieved value: " + value);
        
        // Additional operations on the table
        if (table.contains("row2", "column2")) {
            Integer otherValue = table.get("row2", "column2");
            System.out.println("Other retrieved value: " + otherValue);
        }
        
        // Manipulating additionalMap further
        additionalMap.put("key3", sum);
        System.out.println("Updated additionalMap: " + additionalMap);
    }
}