import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters and extra data
        GzipParameters gzipParameters = new GzipParameters();
        byte[] extraData = {1, 2, 3, 4, 5};

        /* write */ gzipParameters.setExtra(extraData);

        // Create a HashMap to store some arbitrary data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("One", 1);
        dataMap.put("Two", 2);
        dataMap.put("Three", 3);

        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            sum += entry.getValue();
        }

        System.out.println("Sum of values in dataMap: " + sum);

        // Additional operations with GzipParameters
        gzipParameters.setFilename("example.gz");
        String filename = gzipParameters.getFilename();
        System.out.println("Filename: " + filename);

        // More complex operations
        int[] numbers = {10, 20, 30, 40, 50};
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);

        // Retrieve the extra data and verify
        /* read */ byte[] readExtraData = gzipParameters.getExtra();
        
        System.out.print("Read extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
        
        System.out.println();
        
        // Further operations on the extra data
        int extraSum = 0;
        for (byte b : readExtraData) {
            extraSum += b;
        }
        System.out.println("Sum of extra data: " + extraSum);
    }
}