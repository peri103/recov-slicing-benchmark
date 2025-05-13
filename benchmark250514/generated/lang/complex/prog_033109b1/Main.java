import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder builder = new EqualsBuilder();
        Map<String, Integer> map = new HashMap<>();

        // Populate the map with some values
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Perform some operations on the map
        if (map.containsKey("Two")) {
            int value = map.get("Two");
            System.out.println("Value for 'Two': " + value);
        }

        // Append some values to the EqualsBuilder
        /* write */ builder.append(1, 1);

        // Add more logic using the map
        map.put("Four", 4);
        map.put("Five", 5);
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of map values: " + sum);

        // Check if the appended values are equal
        /* read */ boolean isEqual = builder.isEquals();
        System.out.println("Are the values equal? " + isEqual);

        // Continue with other operations
        if (map.containsKey("Three")) {
            System.out.println("'Three' is present in the map.");
        }

        // Final output of map keys
        System.out.println("Keys in map: " + map.keySet());
    }
}