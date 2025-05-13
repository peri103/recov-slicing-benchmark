import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        /* write */ gzipParameters.setISize(12345);

        // Unrelated code to make the program more complex
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Accessing the original write-read pair
        /* read */ int iSize = gzipParameters.getISize();
        System.out.println("ISize: " + iSize);
    }
}