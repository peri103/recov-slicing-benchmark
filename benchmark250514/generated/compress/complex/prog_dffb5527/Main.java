import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        /* write */ jarEntry.setCrc(123456789L);

        // Additional code to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        System.out.println("Sum of map values: " + sum);

        // More operations
        int[] numbers = {5, 10, 15, 20};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }

        System.out.println("Total of array values: " + total);

        // Perform some string manipulation
        String text = "Complex Program";
        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(text.charAt(i));
        }

        System.out.println("Reversed text: " + reversedText.toString());

        // Read the CRC value set earlier
        /* read */ long crcValue = jarEntry.getCrc();
        System.out.println("CRC Value: " + crcValue);
    }
}