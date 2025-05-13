import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();

        // Insert some values into the map
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform some operations on the map
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // Insert a value into the table
        /* write */ table.put("rowKey", "columnKey", 42);

        // Perform operations on the table
        table.put("rowKey2", "columnKey2", 84);
        table.put("rowKey3", "columnKey3", 126);
        table.put("rowKey4", "columnKey4", 168);

        // Calculate the sum of all values in the table
        int tableSum = 0;
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            tableSum += cell.getValue();
        }
        System.out.println("Sum of table values: " + tableSum);

        // Read the previously written value
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println("Read value: " + value);

        // Perform more operations
        map.put("key3", 300);
        map.put("key4", 400);

        // Calculate new sum of map values
        sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("New sum of map values: " + sum);

        // Print all values from the table
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Table cell: (" + cell.getRowKey() + ", " + cell.getColumnKey() + ") = " + cell.getValue());
        }
    }
}