import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<Integer, Integer, String> table = TreeBasedTable.create();
        Map<String, Integer> map = new HashMap<>();

        // Populating the map with some values
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Performing some operations on the map
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of map values: " + sum);

        // Writing to the table
        /* write */ table.put(1, 1, "Hello, World!");

        // Adding more data to the table with different keys
        table.put(2, 1, "Another Entry");
        table.put(3, 1, "Yet Another Entry");

        // Performing some operations on the table data
        for (Table.Cell<Integer, Integer, String> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Reading from the table
        /* read */ String value = table.get(1, 1);
        System.out.println("Read value: " + value);

        // Performing additional operations unrelated to the table
        int product = 1;
        for (int val : map.values()) {
            product *= val;
        }
        System.out.println("Product of map values: " + product);
    }
}