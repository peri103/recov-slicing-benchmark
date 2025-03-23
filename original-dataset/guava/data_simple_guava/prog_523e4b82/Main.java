import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize the TableBuilder
        TableBuilder<String, String, Integer> tableBuilder = HashBasedTable.create().builder();
        
        // Create the Table
        Table<String, String, Integer> table = tableBuilder.build();
        
        // /* write */ Use the put method to write a value into the table
        table.put("row1", "column1", 42);
        
        // /* read */ Use the get method to read the value from the table
        int value = table.get("row1", "column1");
        
        // Print the value
        System.out.println(value);
    }
}