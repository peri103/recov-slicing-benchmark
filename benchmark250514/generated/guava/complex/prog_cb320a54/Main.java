import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.HashBasedTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeBasedTable<Integer, Integer, String> table = TreeBasedTable.create();
        HashBasedTable<Integer, Integer, String> hashTable = HashBasedTable.create();
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        // Populate the HashBasedTable
        hashTable.put(2, 2, "World");
        hashTable.put(3, 3, "Java");

        // Populate the ArrayList
        list.add("Guava");
        list.add("Collections");

        // Populate the HashMap
        map.put(1, "HashMap");
        map.put(2, "Example");

        // Perform operations using map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ table.put(1, 1, "Hello");
        
        // Perform operations using list
        for (String s : list) {
            System.out.println("List Element: " + s);
        }

        // Perform operations using hashTable
        for (String value : hashTable.values()) {
            System.out.println("HashTable Value: " + value);
        }

        /* read */ String value = table.get(1, 1);
        System.out.println(value);

        // More operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}