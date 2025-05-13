import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        // Initialize map with some values
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Add values to list
        list.add(10);
        list.add(20);
        list.add(30);

        /* write */ gzipParameters.setUncompressedSize(12345L);

        // Perform some operations on map and list
        for (String key : map.keySet()) {
            int value = map.get(key);
            list.add(value);
        }

        // Calculate sum of all elements in list
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.println("Sum of list elements: " + sum);

        // Retrieve a value from the map
        int mapValue = map.get("Two");
        System.out.println("Value from map: " + mapValue);

        /* read */ long uncompressedSize = gzipParameters.getUncompressedSize();

        System.out.println("Uncompressed Size: " + uncompressedSize);

        // Perform additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}