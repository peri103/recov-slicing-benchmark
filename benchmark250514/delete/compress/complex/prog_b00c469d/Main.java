import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("key1", 100);
        dataMap.put("key2", 200);

        /* write */ gzipParameters.setHeaderCRC(true);

        // Perform some operations on the map
        int sum = 0;
        for (String key : dataMap.keySet()) {
            sum += dataMap.get(key);
        }
        System.out.println("Sum of values in dataMap: " + sum);

        // Modify the map and perform more operations
        dataMap.put("key3", 300);
        if (dataMap.containsKey("key2")) {
            dataMap.put("key2", dataMap.get("key2") + 50);
        }

        // Calculate average of map values
        int average = sum / dataMap.size();
        System.out.println("Average value in dataMap: " + average);

        // Read the headerCRC value
        /* read */ boolean headerCRC = gzipParameters.getHeaderCRC();
        System.out.println("Header CRC: " + headerCRC);

        // Perform additional operations
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Calculate the product of all values in the map
        int product = 1;
        for (Integer value : dataMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in dataMap: " + product);
    }
}