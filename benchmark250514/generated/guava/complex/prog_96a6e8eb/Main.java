import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

public class Main {
    public static void main(String[] args) {
        // Initialize a Table instance using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Use the write method to put a value into the table
        /* write */ table.put("row1", "column1", 42);
        
        // Initialize another Table instance using TreeBasedTable
        Table<String, String, Integer> anotherTable = TreeBasedTable.create();
        
        // Add some values to the second table
        anotherTable.put("rowA", "columnA", 100);
        anotherTable.put("rowB", "columnB", 200);
        
        // Perform some operations on the second table
        Integer valueA = anotherTable.get("rowA", "columnA");
        Integer valueB = anotherTable.get("rowB", "columnB");
        System.out.println("Value from anotherTable: " + valueA + ", " + valueB);
        
        // Perform some calculations
        int sum = 0;
        for (Table.Cell<String, String, Integer> cell : anotherTable.cellSet()) {
            sum += cell.getValue();
        }
        System.out.println("Sum of values in anotherTable: " + sum);
        
        // More unrelated operations
        int product = valueA * valueB;
        System.out.println("Product of values in anotherTable: " + product);
        
        // Use the read method to get the value from the first table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the retrieved value
        System.out.println("Value from table: " + value);
        
        // More operations
        if (value != null) {
            System.out.println("Value is not null, performing additional operations.");
            int doubledValue = value * 2;
            System.out.println("Doubled value: " + doubledValue);
        }
    }
}