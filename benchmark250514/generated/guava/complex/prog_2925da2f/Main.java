import com.google.common.collect.ArrayTable;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize keys for ArrayTable
        List<String> rowKeys = Arrays.asList("row1", "row2");
        List<String> columnKeys = Arrays.asList("col1", "col2");
        
        // Create an ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        // Put values into the table
        /* write */ table.put("row1", "col1", 42);
        table.put("row2", "col2", 84);
        
        // Perform some unrelated operations
        int sum = 0;
        for (String row : rowKeys) {
            for (String column : columnKeys) {
                Integer val = table.get(row, column);
                if (val != null) {
                    sum += val;
                }
            }
        }
        System.out.println("Sum of all values: " + sum);
        
        // More operations
        ArrayTable<String, String, String> stringTable = ArrayTable.create(rowKeys, columnKeys);
        stringTable.put("row1", "col1", "Hello");
        stringTable.put("row2", "col2", "World");
        
        StringBuilder message = new StringBuilder();
        for (String row : rowKeys) {
            for (String column : columnKeys) {
                String str = stringTable.get(row, column);
                if (str != null) {
                    message.append(str).append(" ");
                }
            }
        }
        System.out.println("Message: " + message.toString().trim());
        
        // Retrieve the original value
        /* read */ Integer value = table.get("row1", "col1");
        
        System.out.println("Retrieved value: " + value);
    }
}