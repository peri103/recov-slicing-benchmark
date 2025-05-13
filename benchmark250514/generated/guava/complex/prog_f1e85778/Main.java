import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = Arrays.asList("row1", "row2");
        List<String> columnKeys = Arrays.asList("column1", "column2");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        
        // Initialize a HashMap and perform some operations
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Perform calculations using the HashMap
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        
        // Put additional values in the table
        table.put("row2", "column1", sum);
        table.put("row2", "column2", 300);
        
        // Perform some operations with the ArrayTable
        Integer valueFromTable = table.get("row2", "column1");
        System.out.println("Sum from table: " + valueFromTable);
        
        // More complex operations with ArrayTable
        if (valueFromTable > 150) {
            table.put("row1", "column2", 500);
        }
        
        // Additional calculations
        int product = valueFromTable * map.get("key1");
        
        /* read */ Integer value = table.get("row1", "column1");
        
        System.out.println("Original value: " + value);
        System.out.println("Product: " + product);
    }
}