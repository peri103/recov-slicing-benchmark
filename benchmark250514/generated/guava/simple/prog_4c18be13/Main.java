import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize row and column keys
        List<String> rowKeys = new ArrayList<>();
        rowKeys.add("row1");
        
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("col1");
        
        // Create an ArrayTable
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);
        
        // Use the write method
        /* write */ table.put("row1", "col1", 42);
        
        // Use the read method
        /* read */ Integer value = table.get("row1", "col1");
        
        // Print the value
        System.out.println(value);
    }
}