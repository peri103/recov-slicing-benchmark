import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        Map<String, Integer> sampleMap = new HashMap<>();

        // Adding some values to the map
        sampleMap.put("One", 1);
        sampleMap.put("Two", 2);
        sampleMap.put("Three", 3);

        // Performing some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in sampleMap: " + sum);

        // Setting the ISize in gzipParameters
        /* write */ gzipParameters.setISize(12345);

        // More operations
        if (sampleMap.containsKey("Two")) {
            sampleMap.put("Four", 4);
        }

        // Performing a calculation
        int product = 1;
        for (int value : sampleMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in sampleMap: " + product);

        // Reading the ISize from gzipParameters
        /* read */ long iSize = gzipParameters.getISize();
        System.out.println("ISize value: " + iSize);

        // Final operations
        sampleMap.put("Five", 5);
        System.out.println("Final map: " + sampleMap);
    }
}