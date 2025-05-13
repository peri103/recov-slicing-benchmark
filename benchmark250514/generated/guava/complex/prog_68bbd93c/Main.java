import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();
        BiMap<Integer, String> reverseMap = HashBiMap.create();

        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");

        reverseMap.put(1, "One");
        reverseMap.put(2, "Two");

        /* write */ map.put("key1", 100);
        reverseMap.put(3, "Three");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Integer valueFromReverseMap = reverseMap.inverse().get("Two");
        System.out.println("Value from reverse map: " + valueFromReverseMap);

        /* read */ Integer value = map.get("key1");
        System.out.println(value);

        reverseMap.put(4, "Four");
        for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        stringMap.put("C", "Cherry");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}