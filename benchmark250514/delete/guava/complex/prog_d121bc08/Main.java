import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();

        // Using the builder to put an instance of Integer
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.putInstance(Integer.class, 42).build();

        // Create a HashMap and populate it with some data
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");

        // Create an ImmutableMap from the HashMap
        ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(hashMap);

        // Perform some operations on the immutableMap
        if (immutableMap.containsKey("key1")) {
            System.out.println("Key1 exists with value: " + immutableMap.get("key1"));
        }

        // Retrieve the instance of Integer from the map
        /* read */ Integer value = map.getInstance(Integer.class);

        // Print the retrieved value
        System.out.println(value);

        // Perform additional operations on the HashMap
        hashMap.put("key3", "value3");
        hashMap.remove("key2");

        // Iterate over the hashMap and print its contents
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}