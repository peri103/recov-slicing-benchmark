import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "One");
        anotherMap.put(2, "Two");
        anotherMap.put(3, "Three");

        // Performing some operations on anotherMap
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ map.putInstance(String.class, "Hello, World!");

        // Adding more complexity with additional data structures
        Map<String, Integer> reverseMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        // Performing some operations on reverseMap
        for (Map.Entry<String, Integer> entry : reverseMap.entrySet()) {
            System.out.println("Reverse Key: " + entry.getKey() + ", Reverse Value: " + entry.getValue());
        }

        // More operations on anotherMap
        if (anotherMap.containsKey(2)) {
            System.out.println("AnotherMap contains key 2");
        }

        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);

        // Additional operations on reverseMap
        if (reverseMap.containsKey("Three")) {
            System.out.println("ReverseMap contains key 'Three'");
        }
    }
}