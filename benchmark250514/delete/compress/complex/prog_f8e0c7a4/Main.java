import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Some operations with ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Add some values to HashMap
        map.put("key1", 100);
        map.put("key2", 200);

        // Perform some calculations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Access HashMap values
        int mapValue = map.get("key1");
        System.out.println("Value for 'key1': " + mapValue);

        // Set CRC32 in gzipParams
        /* write */ gzipParams.setCRC32(123456789);

        // More calculations
        int product = 1;
        for (int num : list) {
            product *= num;
        }
        System.out.println("Product of list elements: " + product);

        // Access another value in HashMap
        int anotherMapValue = map.get("key2");
        System.out.println("Value for 'key2': " + anotherMapValue);

        // Get CRC32 from gzipParams
        /* read */ long crcValue = gzipParams.getCRC32();
        System.out.println("CRC32 Value: " + crcValue);

        // Perform some additional operations
        list.add(40);
        map.put("key3", 300);

        // Print all elements in list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element " + i + ": " + list.get(i));
        }

        // Print all entries in the map
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
    }
}