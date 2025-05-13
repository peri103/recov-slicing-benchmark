import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setCompressionLevel(5);

        // Additional code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        map.put("key1", "value1");
        map.put("key2", "value2");
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        for (String key : map.keySet()) {
            System.out.println("Map Entry: " + key + " -> " + map.get(key));
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Additional unrelated logic
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);

        // Continue with the original read operation
        /* read */ int compressionLevel = gzipParameters.getCompressionLevel();
        System.out.println("Compression Level: " + compressionLevel);
    }
}