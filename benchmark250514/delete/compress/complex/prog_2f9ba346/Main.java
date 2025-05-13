import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters
        GzipParameters gzipParameters = new GzipParameters();
        
        // Some unrelated code for complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String from list: " + str);
        }

        // Complex calculation
        int complexCalculation = map.get("key1") * 2 + map.get("key2") / 2;
        System.out.println("Complex Calculation Result: " + complexCalculation);

        // Write operation on GzipParameters
        /* write */ gzipParameters.setCompressedSize(1024L);

        // More unrelated code
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 10: " + sum);

        // Read operation on GzipParameters
        /* read */ long compressedSize = gzipParameters.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);

        // Further unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}