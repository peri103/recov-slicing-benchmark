import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = new ArrayList<>();
        List<String> columnKeys = new ArrayList<>();
        rowKeys.add("row1");
        columnKeys.add("column1");
        
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        /* write */ table.put("row1", "column1", 42);
        
        // Create another table with different data
        List<String> rowKeys2 = new ArrayList<>();
        List<String> columnKeys2 = new ArrayList<>();
        rowKeys2.add("row2");
        columnKeys2.add("column2");
        
        ArrayTable<String, String, String> table2 = ArrayTable.create(rowKeys2, columnKeys2);
        table2.put("row2", "column2", "Hello World");
        
        // Create a map and perform operations
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Perform some operations on table2
        String greeting = table2.get("row2", "column2");
        System.out.println("Greeting from table2: " + greeting);
        
        // More operations involving the original table
        int product = 1;
        for (String row : rowKeys) {
            for (String column : columnKeys) {
                Integer cellValue = table.get(row, column);
                if (cellValue != null) {
                    product *= cellValue;
                }
            }
        }
        System.out.println("Product of table values: " + product);
        
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
    }
}