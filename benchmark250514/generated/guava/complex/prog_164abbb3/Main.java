import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeBasedTable
        Table<String, String, Integer> table = TreeBasedTable.create();
        
        // Initialize another table to demonstrate more complex operations
        Table<String, String, String> stringTable = HashBasedTable.create();
        
        // Write a value into the TreeBasedTable
        /* write */ table.put("row1", "column1", 42);
        
        // Perform operations on the stringTable
        stringTable.put("row1", "column1", "Hello");
        stringTable.put("row2", "column2", "World");
        
        // Manipulate and retrieve values from the stringTable
        String greeting = stringTable.get("row1", "column1");
        String subject = stringTable.get("row2", "column2");
        
        // Combine and print the values from the stringTable
        System.out.println(greeting + " " + subject);
        
        // More complex operations on TreeBasedTable
        table.put("row2", "column2", 84);
        table.put("row3", "column3", 126);
        
        // Iterate through the TreeBasedTable and print values
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Row: " + cell.getRowKey() + ", Column: " + cell.getColumnKey() + ", Value: " + cell.getValue());
        }
        
        // Read the value from the TreeBasedTable
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the value to ensure it was read correctly
        System.out.println("Read value: " + value);
        
        // Additional operations to enhance complexity
        int sum = 0;
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            sum += cell.getValue();
        }
        
        // Print the sum of all values in the TreeBasedTable
        System.out.println("Sum of all values: " + sum);
    }
}