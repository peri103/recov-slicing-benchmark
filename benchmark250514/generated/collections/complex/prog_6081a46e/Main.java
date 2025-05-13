import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
        Map<String, String> stringMap = new HashMap<>();

        /* write */ map.put("key", 42);

        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");

        // Perform some operations on the stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Additional operations on the original map
        map.put("anotherKey", 24);
        map.put("thirdKey", 100);

        // Retrieve values from the original map
        Integer anotherValue = map.get("anotherKey");
        System.out.println("Another Value: " + anotherValue);

        /* read */ Integer value = map.get("key");
        System.out.println("Original Value: " + value);

        Integer thirdValue = map.get("thirdKey");
        System.out.println("Third Value: " + thirdValue);

        // Perform some calculations
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of values: " + sum);
    }
}