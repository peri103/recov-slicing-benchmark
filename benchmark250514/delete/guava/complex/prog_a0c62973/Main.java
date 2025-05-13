import com.google.common.collect.HashBasedTable;
import com.google.common.collect.RowSortedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RowSortedTable<Integer, String, String> table = HashBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        
        /* write */ table.put(1, "key1", "value1");
        
        map.put("first", 100);
        map.put("second", 200);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        table.put(2, "key2", "value2");
        table.put(3, "key3", "value3");
        
        String anotherValue = table.get(2, "key2");
        System.out.println("Another Value: " + anotherValue);
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of Map Values: " + sum);
        
        /* read */ String value = table.get(1, "key1");
        System.out.println("Read Value: " + value);
        
        table.put(4, "key4", "value4");
        table.put(5, "key5", "value5");
        
        for (int i = 3; i <= 5; i++) {
            System.out.println("Table Value at " + i + ": " + table.get(i, "key" + i));
        }
    }
}