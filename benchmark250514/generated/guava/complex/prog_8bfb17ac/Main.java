import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of Integer to write into the map
        Integer number = 42;

        /* write */ map.putInstance(Integer.class, number);

        // Create a HashMap to store some additional data
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");

        // Iterate over the entries of the stringMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        // Use a nested map structure
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();
        Map<String, Integer> innerMap = new HashMap<>();
        innerMap.put("innerKey1", 100);
        innerMap.put("innerKey2", 200);
        nestedMap.put("outerKey", innerMap);

        // Access the nested map
        Integer innerValue = nestedMap.get("outerKey").get("innerKey1");
        System.out.println("Inner value: " + innerValue);

        /* read */ Integer retrievedNumber = map.getInstance(Integer.class);

        // Print the retrieved value
        System.out.println("Retrieved number: " + retrievedNumber);

        // Additional unrelated logic
        StringBuilder sb = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            sb.append(c);
        }
        System.out.println("Alphabets: " + sb.toString());
    }
}