import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableClassToInstanceMap builder
        ImmutableClassToInstanceMap.Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Use the write method once to put an instance
        /* write */ builder.putInstance(String.class, "Hello, World!");

        // Create a HashMap and populate it with some data
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Print out all entries in the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Build the immutable map
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Create another ImmutableMap from the HashMap
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);

        // Print out all entries in the ImmutableMap
        for (String key : immutableMap.keySet()) {
            System.out.println("Immutable Key: " + key + ", Immutable Value: " + immutableMap.get(key));
        }

        // Use the read method once to get the instance
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value to ensure it was read correctly
        System.out.println(value);

        // Perform some calculations using values from the HashMap
        int sum = 0;
        for (Integer num : hashMap.values()) {
            sum += num;
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Perform some calculations using values from the ImmutableMap
        int immutableSum = 0;
        for (Integer num : immutableMap.values()) {
            immutableSum += num;
        }
        System.out.println("Sum of values in ImmutableMap: " + immutableSum);
    }
}