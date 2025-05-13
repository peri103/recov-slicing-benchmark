import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a TreeBasedTable instance
        Table<Integer, Integer, String> table = TreeBasedTable.create();
        
        // Use the put method to write a value
        /* write */ table.put(1, 1, "value");
        
        // Use the get method to read the value
        /* read */ String value = table.get(1, 1);
        
        // Print the value
        System.out.println(value);
    }
}