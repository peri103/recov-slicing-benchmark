import com.google.common.collect.EnumHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize an EnumHashBiMap with an example enum class
        EnumHashBiMap<ExampleEnum, String> map = EnumHashBiMap.create(ExampleEnum.class);

        // Initialize a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();

        // Add some values to the HashMap
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);

        // Perform some operations on the HashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);

        // Write a value to the EnumHashBiMap using the put method
        /* write */ map.put(ExampleEnum.FIRST, "Hello");

        // Add more values to the HashMap
        hashMap.put("Key3", 300);
        hashMap.put("Key4", 400);

        // Perform a lookup in the HashMap
        Integer lookupValue = hashMap.get("Key2");
        System.out.println("Lookup value for 'Key2': " + lookupValue);

        // Read the value from the EnumHashBiMap using the get method
        /* read */ String enumValue = map.get(ExampleEnum.FIRST);

        // Print the value from the EnumHashBiMap to verify it was read correctly
        System.out.println(enumValue);

        // Perform additional operations on the HashMap
        hashMap.remove("Key1");
        System.out.println("HashMap after removal: " + hashMap);
    }

    // Example enum to use with the EnumHashBiMap
    private enum ExampleEnum {
        FIRST, SECOND;
    }
}