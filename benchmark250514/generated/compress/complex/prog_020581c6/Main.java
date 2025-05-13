import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original API pair usage
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");
        /* write */ entry.setCompressedSize(1024);

        // Additional code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 100);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Iterating over the list
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Iterating over the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Some arithmetic operations
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        System.out.println("Sum of numbers: " + result);

        // Final read from the original API pair
        /* read */ long compressedSize = entry.getCompressedSize();
        System.out.println("Compressed Size: " + compressedSize);
    }
}