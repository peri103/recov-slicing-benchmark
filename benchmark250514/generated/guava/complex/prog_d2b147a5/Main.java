import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Initialize a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        
        // Populate the map with some data
        map.put("alpha", 100);
        map.put("beta", 200);
        
        // Perform operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Add more data to the map
        map.put("gamma", 300);
        
        // Perform a calculation based on map values
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Write to the table
        /* write */ table.put("row1", "column1", 42);
        
        // Perform operations on the table
        table.put("row2", "column1", 24);
        table.put("row1", "column2", 84);
        
        // Calculate a sum of specific column values
        int columnSum = 0;
        for (String row : table.rowKeySet()) {
            columnSum += table.get(row, "column1");
        }
        System.out.println("Sum of 'column1' in all rows: " + columnSum);
        
        // Read from the table
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Value at 'row1', 'column1': " + value);
        
        // Further operations on the table
        if (table.contains("row2", "column1")) {
            System.out.println("Table contains 'row2', 'column1'");
        }
        
        // Iterate over table entries
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
    }
}