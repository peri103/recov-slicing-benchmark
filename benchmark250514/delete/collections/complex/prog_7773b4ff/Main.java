import org.apache.commons.collections4.multimap.LinkedHashValuedHashMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashValuedHashMap<String, String> map = new LinkedHashValuedHashMap<>();
        ArrayListValuedHashMap<String, Integer> anotherMap = new ArrayListValuedHashMap<>();
        HashMap<String, String> simpleMap = new HashMap<>();

        // Adding elements to anotherMap
        anotherMap.put("numbers", 1);
        anotherMap.put("numbers", 2);
        anotherMap.put("numbers", 3);

        // Adding elements to simpleMap
        simpleMap.put("a", "apple");
        simpleMap.put("b", "banana");

        // Perform some operations on anotherMap
        for (int num : anotherMap.get("numbers")) {
            System.out.println("Number: " + num);
        }

        // Perform some operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ map.put("key", "value");

        // More complex operations
        simpleMap.put("c", "cherry");
        anotherMap.put("fruits", 5);

        // Further operations with anotherMap
        for (int num : anotherMap.get("fruits")) {
            System.out.println("Fruit number: " + num);
        }

        // Further operations with simpleMap
        for (String key : simpleMap.keySet()) {
            System.out.println("SimpleMap Key: " + key);
        }

        /* read */ String value = map.get("key").iterator().next();
        System.out.println("Read value from map: " + value);

        // Final operations
        anotherMap.put("numbers", 4);
        for (int num : anotherMap.get("numbers")) {
            System.out.println("Updated Number: " + num);
        }
    }
}