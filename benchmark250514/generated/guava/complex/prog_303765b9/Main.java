import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing an ImmutableBiMap builder
        ImmutableBiMap.Builder<String, String> builder = new ImmutableBiMap.Builder<>();

        // Adding some unrelated complex logic
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("apple", 3);
        countMap.put("banana", 2);
        countMap.put("orange", 5);

        int totalFruits = 0;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            totalFruits += entry.getValue();
        }
        System.out.println("Total number of fruits: " + totalFruits);

        // Using the builder to add a key-value pair
        /* write */ builder.put("key", "value");

        // More unrelated logic
        ImmutableMap<String, Integer> priceMap = ImmutableMap.of(
            "apple", 100,
            "banana", 50,
            "orange", 80
        );

        int totalPrice = 0;
        for (String fruit : countMap.keySet()) {
            totalPrice += countMap.get(fruit) * priceMap.get(fruit);
        }
        System.out.println("Total price of fruits: " + totalPrice);

        // Building the ImmutableBiMap
        ImmutableBiMap<String, String> biMap = builder.build();

        // Further unrelated complex logic
        Map<String, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, String> entry : biMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Reverse map: " + reverseMap);

        // Retrieving the value using the key
        /* read */ String value = biMap.get("key");
        System.out.println("Retrieved value: " + value);

        // Additional logic to ensure complexity
        if (reverseMap.containsKey("value")) {
            System.out.println("Reverse map contains 'value' with key: " + reverseMap.get("value"));
        }
    }
}