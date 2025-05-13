import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeBasedTable
        Table<Integer, Integer, String> treeTable = TreeBasedTable.create();

        // Initialize another table for additional complexity
        Table<String, String, Integer> hashTable = HashBasedTable.create();

        // Insert values into hashTable
        hashTable.put("Row1", "Column1", 100);
        hashTable.put("Row2", "Column2", 200);

        // Perform operations on hashTable
        int sum = 0;
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            sum += cell.getValue();
        }
        System.out.println("Sum of values in hashTable: " + sum);

        // Write a value into the treeTable
        /* write */ treeTable.put(1, 1, "Hello World");

        // Perform unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Read the value from the treeTable
        /* read */ String value = treeTable.get(1, 1);
        
        // Print the value
        System.out.println(value);

        // Further manipulate hashTable for complexity
        hashTable.put("Row3", "Column3", 300);
        int maxValue = Integer.MIN_VALUE;
        for (Table.Cell<String, String, Integer> cell : hashTable.cellSet()) {
            if (cell.getValue() > maxValue) {
                maxValue = cell.getValue();
            }
        }
        System.out.println("Maximum value in hashTable: " + maxValue);
    }
}