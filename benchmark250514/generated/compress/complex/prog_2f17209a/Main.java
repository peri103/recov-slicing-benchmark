import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        byte[] extraData = {1, 2, 3, 4};

        // Unrelated complex data structure
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("alpha", 10);
        dataMap.put("beta", 20);
        dataMap.put("gamma", 30);

        // More complex operations on dataMap
        int sum = 0;
        for (String key : dataMap.keySet()) {
            sum += dataMap.get(key);
        }
        System.out.println("Sum of values in dataMap: " + sum);

        /* write */ entry.setExtra(extraData);

        // Additional unrelated logic
        int[] numbers = {5, 10, 15, 20};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers array: " + product);

        // More operations on dataMap
        if (dataMap.containsKey("alpha")) {
            int value = dataMap.get("alpha");
            System.out.println("Value of 'alpha': " + value);
        }

        /* read */ byte[] readExtraData = entry.getExtra();

        // Print the read extra data
        System.out.print("Read extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }

        // Final operations on dataMap
        dataMap.put("delta", 40);
        System.out.println("\nUpdated dataMap: " + dataMap);
    }
}