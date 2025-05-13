import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashBasedTable
        Table<String, String, Integer> table = HashBasedTable.create();

        // Initialize a HashMap
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        // Initialize an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Put the ArrayList into the HashMap
        map.put("numbers", list);

        // Add more data to the ArrayList
        list.add(40);
        list.add(50);

        // Add a new key-value pair to the map
        map.put("moreNumbers", new ArrayList<>());
        map.get("moreNumbers").add(60);
        map.get("moreNumbers").add(70);

        // Write to the table
        /* write */ table.put("rowKey", "columnKey", 42);

        // Perform operations on the map
        for (String key : map.keySet()) {
            ArrayList<Integer> numbers = map.get(key);
            for (int num : numbers) {
                System.out.println("Number from map: " + num);
            }
        }

        // Add more data to the table
        table.put("anotherRow", "anotherColumn", 100);

        // Read from the table
        /* read */ Integer value = table.get("rowKey", "columnKey");
        System.out.println("Read value from table: " + value);

        // More complex operations with the table
        if (table.contains("anotherRow", "anotherColumn")) {
            int anotherValue = table.get("anotherRow", "anotherColumn");
            System.out.println("Another value from table: " + anotherValue);
        }

        // Perform computations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list: " + sum);
    }
}