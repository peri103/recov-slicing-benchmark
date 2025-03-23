import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Main {
    public static void main(String[] args) {
        // Create a Table using HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();
        
        // Initialize the keys and value
        String rowKey = "row1";
        String columnKey = "column1";
        Integer valueToWrite = 42;
        
        /* write */ table.put(rowKey, columnKey, valueToWrite);
        
        /* read */ Integer valueRead = table.get(rowKey, columnKey);
        
        System.out.println(valueRead);
    }
}