import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        Map<Integer, String> map = new HashMap<>();
        
        // Adding some entries to the map
        for (int i = 0; i < 5; i++) {
            map.put(i, "Value" + i);
        }
        
        // Iterating over the map entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ table.put(1, 1, "value");

        // Performing some operations on the table
        table.put(2, 2, "anotherValue");
        table.put(3, 3, "thirdValue");

        // Iterating over the table rows
        for (Table.Cell<Integer, Integer, String> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        /* read */ String value = table.get(1, 1);
        System.out.println(value);

        // Adding more entries to the table
        table.put(4, 4, "fourthValue");
        table.put(5, 5, "fifthValue");

        // Retrieving and printing more values from the table
        for (int i = 2; i <= 5; i++) {
            System.out.println("Value at (" + i + ", " + i + "): " + table.get(i, i));
        }
    }
}