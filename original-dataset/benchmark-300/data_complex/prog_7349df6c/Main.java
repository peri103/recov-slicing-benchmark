import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add("Item " + i);
        }
        
        // Writing to the map
        /* write */ map.put(1, "Value");
        
        // Performing some operations on the list
        for (String item : list) {
            System.out.println(item);
        }
        
        // Creating another map and performing operations
        SortedMap<Integer, Integer> anotherMap = new TreeMap<>();
        anotherMap.put(10, 100);
        anotherMap.put(20, 200);
        
        // Reading from the original map
        /* read */ String value = map.get(1);
        System.out.println("Read value: " + value);
        
        // Performing more operations on the list
        list.add("Additional Item");
        for (String item : list) {
            System.out.println(item);
        }
        
        // Adding more entries to the anotherMap
        anotherMap.put(30, 300);
        anotherMap.put(40, 400);
        
        // Printing values from anotherMap
        for (Integer key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }
    }
}