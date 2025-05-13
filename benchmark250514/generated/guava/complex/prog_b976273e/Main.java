import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the row and column keys for ArrayTable
        String[] rows = {"row1", "row2"};
        String[] columns = {"col1", "col2"};

        // Create an ArrayTable with specified row and column keys
        ArrayTable<String, String, Integer> table = ArrayTable.create(Arrays.asList(rows), Arrays.asList(columns));

        // Create a HashBasedTable for additional complexity
        Table<String, String, String> hashTable = HashBasedTable.create();
        
        // Put values in the HashBasedTable
        hashTable.put("row1", "col1", "Hello");
        hashTable.put("row2", "col2", "World");

        // Use the write method to put a value into the ArrayTable
        /* write */ table.put("row1", "col1", 42);

        // Perform some operations using the HashBasedTable
        String greeting = hashTable.get("row1", "col1");
        String subject = hashTable.get("row2", "col2");
        System.out.println(greeting + " " + subject);

        // Perform calculations and store results in the ArrayTable
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            table.put("row1", "col2", sum);
        }

        // Retrieve and print the calculated sum from the ArrayTable
        Integer calculatedSum = table.get("row1", "col2");
        System.out.println("Calculated Sum: " + calculatedSum);

        // Use the read method to get the value from the ArrayTable
        /* read */ Integer value = table.get("row1", "col1");

        // Print the value to verify it was correctly written and read
        System.out.println("Original Value: " + value);

        // Additional operations for complexity
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        table.put("row2", "col1", product);

        // Retrieve and print the calculated product from the ArrayTable
        Integer calculatedProduct = table.get("row2", "col1");
        System.out.println("Calculated Product: " + calculatedProduct);
    }
}