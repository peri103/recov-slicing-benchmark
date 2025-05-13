import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "World");

        /* write */ table.put(1, 1, "Hello");

        // Additional logic to add complexity
        for (int i = 0; i < 5; i++) {
            table.put(i, i + 1, "Value " + i);
        }

        // Use the map to store additional data
        map.put(3, "Complexity");
        map.put(4, "Increased");

        // Iterate over the map and print its contents
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // More complex logic involving the table
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                table.put(row, col, "Cell " + row + "," + col);
            }
        }

        // Retrieve and print data from the table
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.println("Table[" + row + "][" + col + "] = " + table.get(row, col));
            }
        }

        /* read */ String value = table.get(1, 1);
        System.out.println("Read value: " + value);

        // Additional operations on the table
        table.put(5, 5, "End");
        System.out.println("Final cell value: " + table.get(5, 5));
    }
}