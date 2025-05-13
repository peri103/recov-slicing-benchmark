import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ jarEntry.setExtra(extraData);

        // Additional unrelated code to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);

        // Another unrelated code block
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total of numbers array: " + total);

        // Complex operations with a different JarArchiveEntry
        JarArchiveEntry anotherJarEntry = new JarArchiveEntry("anotherExample.jar");
        byte[] otherExtraData = new byte[]{6, 7, 8, 9, 10};
        anotherJarEntry.setExtra(otherExtraData);
        byte[] readOtherExtraData = anotherJarEntry.getExtra();
        System.out.print("Other extra data: ");
        for (byte b : readOtherExtraData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Reading the original extra data
        /* read */ byte[] readExtraData = jarEntry.getExtra();
        System.out.print("Original extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}