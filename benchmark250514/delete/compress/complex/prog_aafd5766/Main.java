import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setCRC32(123456789L);

        // Create a map to hold some data
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("first", 100);
        dataMap.put("second", 200);
        dataMap.put("third", 300);

        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);

        // Modify the map
        dataMap.put("fourth", 400);
        dataMap.remove("second");

        // Access the original GzipParameters object
        /* read */ long crc32Value = gzipParams.getCRC32();
        System.out.println("CRC32 Value: " + crc32Value);

        // Further operations on the map
        int product = 1;
        for (Integer value : dataMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in map: " + product);

        // Create another GzipParameters instance and perform operations
        GzipParameters anotherGzipParams = new GzipParameters();
        anotherGzipParams.setCompressionLevel(5);
        System.out.println("Compression Level: " + anotherGzipParams.getCompressionLevel());
    }
}