import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        Map<Integer, String> additionalData = new HashMap<>();

        // Adding some unrelated operations using HashMap
        for (int i = 0; i < 5; i++) {
            additionalData.put(i, "Value " + i);
        }

        // Performing operations with HashMap
        for (Map.Entry<Integer, String> entry : additionalData.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ table.put(1, 1, "Hello, World!");

        // Additional operations with TreeBasedTable
        table.put(2, 2, "Another Value");
        table.put(3, 3, "Yet Another Value");

        // Iterating over the table and printing values
        for (Table.Cell<Integer, Integer, String> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Complex operation involving calculations
        int sumOfKeys = 0;
        for (Integer key : additionalData.keySet()) {
            sumOfKeys += key;
        }
        System.out.println("Sum of keys in additionalData: " + sumOfKeys);

        /* read */ String value = table.get(1, 1);
        System.out.println(value);

        // Performing more operations after reading
        String concatenatedValues = "";
        for (String val : additionalData.values()) {
            concatenatedValues += val + " ";
        }
        System.out.println("Concatenated Values: " + concatenatedValues.trim());

        // Final operation demonstrating table usage
        String anotherValue = table.get(2, 2);
        System.out.println("Another Value from table: " + anotherValue);
    }
}