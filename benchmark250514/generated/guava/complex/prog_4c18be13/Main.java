import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        List<String> rowKeys = new ArrayList<>();
        rowKeys.add("row1");
        rowKeys.add("row2");
        
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("col1");
        columnKeys.add("col2");
        
        // Create an ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        // Use the write method
        /* write */ table.put("row1", "col1", 42);
        
        // Additional operations using ArrayTable
        table.put("row2", "col2", 84);
        table.put("row1", "col2", 21);
        
        // Perform some unrelated operations
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Perform operations on rowKeys and columnKeys
        for (String row : rowKeys) {
            System.out.println("Row key: " + row);
        }
        
        for (String col : columnKeys) {
            System.out.println("Column key: " + col);
        }
        
        // Use the read method
        /* read */ Integer value = table.get("row1", "col1");
        
        // Print the value
        System.out.println("Read value from table: " + value);
        
        // Additional operations with table
        Integer value2 = table.get("row2", "col2");
        Integer value3 = table.get("row1", "col2");
        
        System.out.println("Value at row2, col2: " + value2);
        System.out.println("Value at row1, col2: " + value3);
    }
}