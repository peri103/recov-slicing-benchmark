import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.ArrayTable;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Create another table using ArrayTable
        Table<String, String, String> table2 = ArrayTable.create(ImmutableMap.of("row1", "row2"), ImmutableMap.of("column1", "column2"));
        
        // Insert data into table2
        table2.put("row1", "column1", "Hello");
        table2.put("row2", "column2", "World");
        
        // Perform some operations on table2
        String greeting = table2.get("row1", "column1");
        String place = table2.get("row2", "column2");
        System.out.println(greeting + " " + place);
        
        // Insert data into the first table
        /* write */ table.put("row1", "column1", 42);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Retrieve the value from the first table
        /* read */ Integer value = table.get("row1", "column1");
        
        // Print the retrieved value
        System.out.println("Value from table: " + value);
        
        // Perform operations with more complex data structures
        Table<String, String, Double> table3 = HashBasedTable.create();
        table3.put("product1", "price", 19.99);
        table3.put("product2", "price", 29.99);
        
        Double price1 = table3.get("product1", "price");
        Double price2 = table3.get("product2", "price");
        
        System.out.println("Total price: " + (price1 + price2));
    }
}