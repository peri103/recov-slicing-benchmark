import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        // Initialize and manipulate a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Create another GzipParameters object and manipulate it
        GzipParameters gzipParameters2 = new GzipParameters();
        gzipParameters2.setFlags(8);
        int flags2 = gzipParameters2.getFlags();
        System.out.println("Flags of second GzipParameters: " + flags2);
        
        // Perform operations on an array
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        // Write to the original GzipParameters object
        /* write */ gzipParameters.setFlags(4);
        
        // Perform more unrelated operations
        double[] values = {3.14, 2.71, 1.62};
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println("Total of array values: " + total);
        
        // Read from the original GzipParameters object
        /* read */ int flags = gzipParameters.getFlags();
        System.out.println("Flags of original GzipParameters: " + flags);
        
        // Manipulate a string
        String text = "Hello, World!";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed text: " + reversed);
    }
}