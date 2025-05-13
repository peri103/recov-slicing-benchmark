import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a JarArchiveEntry
        JarArchiveEntry entry = new JarArchiveEntry("example.jar");

        // Create a byte array to use as extra data
        byte[] extraData = {1, 2, 3, 4};

        /* write */ entry.setExtra(extraData);

        // Add some unrelated complexity with ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Process the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Further complexity with a different JarArchiveEntry
        JarArchiveEntry anotherEntry = new JarArchiveEntry("anotherExample.jar");
        byte[] differentExtraData = {5, 6, 7, 8};
        anotherEntry.setExtra(differentExtraData);
        byte[] anotherRetrievedData = anotherEntry.getExtra();
        System.out.print("Another entry extra data: ");
        for (byte b : anotherRetrievedData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Use the original entry's extra data
        /* read */ byte[] retrievedData = entry.getExtra();

        // Print the retrieved data to verify
        System.out.print("Original entry extra data: ");
        for (byte b : retrievedData) {
            System.out.print(b + " ");
        }
        System.out.println();

        // More unrelated operations
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        for (String word : words) {
            System.out.println(word);
        }
    }
}