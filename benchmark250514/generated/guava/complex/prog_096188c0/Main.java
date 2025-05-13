import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableSet.builder();
        Map<String, Integer> map = new HashMap<>();
        Random random = new Random();
        
        // Adding random values to the map
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, random.nextInt(100));
        }

        // Iterating over the map and adding values to the builder
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            builder.add(entry.getValue());
        }

        /* write */ builder.add(1);
        ImmutableSet<Integer> immutableSet = builder.build();

        // Performing some operations on the set
        int sum = 0;
        for (Integer value : immutableSet) {
            sum += value;
        }
        System.out.println("Sum of elements in the set: " + sum);

        // Checking if a specific value is present in the set
        /* read */ boolean containsValue = immutableSet.contains(1);
        System.out.println(containsValue);

        // Further operations on the map
        for (String key : map.keySet()) {
            Integer val = map.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }
    }
}