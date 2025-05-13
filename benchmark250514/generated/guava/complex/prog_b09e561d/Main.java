import com.google.common.collect.ArrayTable;
import java.util.List;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        List<String> rowKeys = List.of("Row1");
        List<String> columnKeys = List.of("Column1");
        ArrayTable<String, String, Integer> table = ArrayTable.create(rowKeys, columnKeys);

        /* write */ table.put("Row1", "Column1", 42);

        // Additional complex code
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        System.out.println("Sum of values in map: " + sum);

        List<String> newRowKeys = List.of("Row2", "Row3");
        List<String> newColumnKeys = List.of("Column2", "Column3");
        ArrayTable<String, String, String> newTable = ArrayTable.create(newRowKeys, newColumnKeys);

        newTable.put("Row2", "Column2", "Hello");
        newTable.put("Row3", "Column3", "World");

        String greeting = newTable.get("Row2", "Column2") + " " + newTable.get("Row3", "Column3");
        System.out.println("Greeting: " + greeting);

        /* read */ Integer value = table.get("Row1", "Column1");
        System.out.println("Original table value: " + value);
    }
}