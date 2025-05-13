import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize an ArArchiveEntry with a name and size
        ArArchiveEntry entry = new ArArchiveEntry("example", 1000);
        
        // Initialize a list to hold multiple archive entries
        ArrayList<ArArchiveEntry> archiveEntries = new ArrayList<>();
        
        // Create and add additional entries to the list
        for (int i = 0; i < 5; i++) {
            ArArchiveEntry tempEntry = new ArArchiveEntry("file" + i, 200 * i);
            tempEntry.setCompressedSize(100 * i);
            archiveEntries.add(tempEntry);
        }
        
        // Perform operations on the list of entries
        for (ArArchiveEntry e : archiveEntries) {
            System.out.println("Entry Name: " + e.getName() + ", Compressed Size: " + e.getCompressedSize());
        }
        
        // Set compressed size for the original entry
        /* write */ entry.setCompressedSize(500);
        
        // Perform some unrelated computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read the compressed size of the original entry
        /* read */ long compressedSize = entry.getCompressedSize();
        
        // Output the compressed size
        System.out.println("Compressed Size of 'example': " + compressedSize);
        
        // Further operations to add complexity
        ArArchiveOutputStream archiveOutputStream = null; // Placeholder for potential future use
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}