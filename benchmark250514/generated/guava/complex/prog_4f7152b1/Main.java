import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Table<String, String, Integer> table = TreeBasedTable.create();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        map.put("key1", 100);
        map.put("key2", 200);
        list.add("element1");
        list.add("element2");

        /* write */ table.put("row1", "column1", 42);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some operations on the list
        for (String element : list) {
            System.out.println("List Element: " + element);
        }

        // Additional operations on the table
        table.put("row2", "column2", 84);
        Integer value2 = table.get("row2", "column2");
        System.out.println("Table Value at row2, column2: " + value2);

        /* read */ Integer value = table.get("row1", "column1");
        System.out.println("Table Value at row1, column1: " + value);

        // More complex operations
        table.put("row3", "column3", 126);
        for (Table.Cell<String, String, Integer> cell : table.cellSet()) {
            System.out.println("Cell: Row=" + cell.getRowKey() + ", Column=" + cell.getColumnKey() + ", Value=" + cell.getValue());
        }
    }
}