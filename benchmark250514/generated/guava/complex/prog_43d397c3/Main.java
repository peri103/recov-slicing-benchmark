import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys for the ArrayTable
        List<String> rowKeys = new ArrayList<>();
        rowKeys.add("row1");
        rowKeys.add("row2");
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("column1");
        columnKeys.add("column2");

        // Create the ArrayTable
        ArrayTable<String, String, Integer> arrayTable = ArrayTable.create(rowKeys, columnKeys);

        // Write a value into the arrayTable
        /* write */ arrayTable.put("row1", "column1", 42);

        // Create another table using HashBasedTable
        Table<String, String, String> hashTable = HashBasedTable.create();
        hashTable.put("row1", "column1", "Hello");
        hashTable.put("row2", "column2", "World");

        // Perform some operations on hashTable
        String greeting = hashTable.get("row1", "column1");
        System.out.println("Greeting: " + greeting);

        // Iterate over the hashTable and print values
        for (Table.Cell<String, String, String> cell : hashTable.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum: " + sum);

        // Read the value from the arrayTable
        /* read */ Integer value = arrayTable.get("row1", "column1");

        // Print the value
        System.out.println("Read value from ArrayTable: " + value);

        // Perform more operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 5);
        }

        // Print numbers
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}