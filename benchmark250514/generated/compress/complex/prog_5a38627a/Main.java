import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original ZipArchiveEntry instance
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");

        // Create a list to store multiple ZipArchiveEntry objects
        ArrayList<ZipArchiveEntry> zipEntries = new ArrayList<>();

        // Add the original entry to the list
        zipEntries.add(zipEntry);

        // Create additional ZipArchiveEntry objects with different attributes
        ZipArchiveEntry zipEntry1 = new ZipArchiveEntry("file1.txt");
        zipEntry1.setExternalAttributes(67890L);
        zipEntries.add(zipEntry1);

        ZipArchiveEntry zipEntry2 = new ZipArchiveEntry("file2.txt");
        zipEntry2.setExternalAttributes(11111L);
        zipEntries.add(zipEntry2);

        // Set external attributes for the original entry
        /* write */ zipEntry.setExternalAttributes(12345L);

        // Iterate over the list and print external attributes for each entry
        for (ZipArchiveEntry entry : zipEntries) {
            long attributes = entry.getExternalAttributes();
            System.out.println("Entry: " + entry.getName() + ", External Attributes: " + attributes);
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More complex logic using the list
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Total sum of numbers: " + total);

        // Read the external attributes from the original entry
        /* read */ long originalAttributes = zipEntry.getExternalAttributes();
        System.out.println("Original Entry External Attributes: " + originalAttributes);
    }
}