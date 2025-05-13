import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        
        /* write */ table.put("row1", "column1", 42);
        
        map.put("key1", 100);
        map.put("key2", 200);
        
        for (String key : map.keySet()) {
            System.out.println("Map value for " + key + ": " + map.get(key));
        }
        
        Integer tableValue = table.get("row1", "column1");
        map.put("fromTable", tableValue);
        
        for (String key : map.keySet()) {
            System.out.println("Updated Map value for " + key + ": " + map.get(key));
        }
        
        /* read */ Integer value = table.get("row1", "column1");
        System.out.println(value);
        
        Table<String, String, String> stringTable = HashBasedTable.create();
        stringTable.put("row2", "column2", "Hello World");
        
        String stringValue = stringTable.get("row2", "column2");
        System.out.println(stringValue);
        
        Table<Integer, Integer, Integer> numberTable = HashBasedTable.create();
        numberTable.put(1, 1, 10);
        numberTable.put(2, 2, 20);
        
        for (Integer row : numberTable.rowKeySet()) {
            for (Integer column : numberTable.columnKeySet()) {
                Integer numValue = numberTable.get(row, column);
                if (numValue != null) {
                    System.out.println("NumberTable value at (" + row + ", " + column + "): " + numValue);
                }
            }
        }
    }
}