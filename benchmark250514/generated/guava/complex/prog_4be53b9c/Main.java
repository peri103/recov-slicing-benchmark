import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        /* write */ table.put("row1", "column1", 42);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Entry: " + entry.getKey() + " = " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Add more entries to the table
        table.put("row2", "column1", 84);
        table.put("row1", "column2", 126);

        // Retrieve and print values from the table
        Integer value1 = table.get("row2", "column1");
        Integer value2 = table.get("row1", "column2");
        System.out.println("Value at (row2, column1): " + value1);
        System.out.println("Value at (row1, column2): " + value2);

        /* read */ Integer value = table.get("row1", "column1");

        System.out.println("Value at (row1, column1): " + value);

        // Add more complex operations
        for (String rowKey : table.rowKeySet()) {
            Map<String, Integer> row = table.row(rowKey);
            for (Map.Entry<String, Integer> cell : row.entrySet()) {
                System.out.println("Table Entry: (" + rowKey + ", " + cell.getKey() + ") = " + cell.getValue());
            }
        }
    }
}