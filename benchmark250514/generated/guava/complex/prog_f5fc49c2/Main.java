import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Performing operations on the map
        if (map.containsKey("key1")) {
            System.out.println("Map contains key1 with value: " + map.get("key1"));
        }

        // Adding more elements to the table
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);

        // Performing operations on the table
        for (String row : table.rowKeySet()) {
            for (String column : table.columnKeySet()) {
                Integer val = table.get(row, column);
                if (val != null) {
                    System.out.println("Table value at (" + row + ", " + column + "): " + val);
                }
            }
        }

        /* write */ table.put("row1", "column1", 42);

        // Performing operations to make the program more complex
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // More operations on the table
        table.put("row4", "column4", 168);
        table.put("row5", "column5", 210);

        // Retrieving the original value
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Retrieved value: " + value);

        // Final operations on the table
        int total = 0;
        for (Map.Entry<String, Map<String, Integer>> rowEntry : table.rowMap().entrySet()) {
            for (Integer cellValue : rowEntry.getValue().values()) {
                total += cellValue;
            }
        }
        System.out.println("Total value of all table cells: " + total);
    }
}