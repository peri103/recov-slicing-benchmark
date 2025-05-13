import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters and set flags
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setFlags(123);

        // Create a HashMap and perform operations
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Perform some operations on the map
        if (map.containsKey("two")) {
            int value = map.get("two");
            System.out.println("Value for key 'two': " + value);
        }

        // Modify the map
        map.put("four", 4);
        map.remove("one");

        // Print all keys and values in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform additional operations unrelated to the original write-read pair
        int sum = 0;
        for (Integer val : map.values()) {
            sum += val;
        }
        System.out.println("Sum of values in the map: " + sum);

        // Read the flags from GzipParameters
        /* read */ int flags = gzipParameters.getFlags();
        System.out.println("Flags set in GzipParameters: " + flags);

        // Perform a simple computation and output the result
        int computationResult = sum * flags;
        System.out.println("Result of computation using flags and sum: " + computationResult);
    }
}