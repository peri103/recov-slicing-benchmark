import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Adding elements to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Perform operations on list and map
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        int mapSum = 0;
        for (String key : map.keySet()) {
            mapSum += map.get(key);
        }

        // Set external attributes
        /* write */ zipEntry.setExternalAttributes(12345);

        // More operations
        int product = 1;
        for (int number : numbers) {
            product *= (number + 1);
        }

        if (mapSum > 0) {
            map.put("four", 4);
        }

        // Get external attributes
        /* read */ int externalAttributes = zipEntry.getExternalAttributes();

        // Print results
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Sum of map values: " + mapSum);
        System.out.println("Product of numbers: " + product);
        System.out.println("External Attributes: " + externalAttributes);
    }
}