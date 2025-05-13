import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();
        /* write */ map.put("key", "value");

        // Additional functionality
        Map<String, ArrayList<String>> complexMap = new HashMap<>();
        ArrayList<String> valuesList = new ArrayList<>();
        valuesList.add("first");
        valuesList.add("second");
        complexMap.put("complexKey", valuesList);

        // Process the complexMap
        for (Map.Entry<String, ArrayList<String>> entry : complexMap.entrySet()) {
            System.out.println("Processing key: " + entry.getKey());
            for (String val : entry.getValue()) {
                System.out.println("Processing value: " + val);
            }
        }

        // More operations on the original map
        map.put("key", "anotherValue");
        map.put("anotherKey", "value1");
        map.put("anotherKey", "value2");

        // Process the map
        for (String key : map.keySet()) {
            System.out.println("Key in map: " + key);
            for (String val : map.get(key)) {
                System.out.println("Value in map: " + val);
            }
        }

        // Read the value from the original write-read pair
        /* read */ String value = map.get("key").iterator().next();
        System.out.println("Original read value: " + value);

        // Additional processing
        ArrayList<String> additionalList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            additionalList.add("Item " + i);
        }

        for (String item : additionalList) {
            System.out.println("Additional list item: " + item);
        }
    }
}