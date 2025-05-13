import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example.txt", 1000);
        ArArchiveEntry entry2 = new ArArchiveEntry("example2.txt", 2000);
        ArArchiveOutputStream arOutput = null; // Just for demonstration, not used in actual operations

        List<ArArchiveEntry> archiveEntries = new ArrayList<>();
        archiveEntries.add(entry);
        archiveEntries.add(entry2);

        // Manipulate entry2 attributes
        entry2.setExternalAttributes(54321);
        long attr2 = entry2.getExternalAttributes();
        System.out.println("Entry2 Attributes: " + attr2);

        // Perform some operations with archiveEntries
        for (ArArchiveEntry archiveEntry : archiveEntries) {
            System.out.println("Archive Entry: " + archiveEntry.getName() + ", Size: " + archiveEntry.getSize());
        }

        // Set external attributes for entry
        /* write */ entry.setExternalAttributes(12345);

        // Perform unrelated calculations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 99: " + sum);

        // Read external attributes for entry
        /* read */ long attributes = entry.getExternalAttributes();
        System.out.println("Entry Attributes: " + attributes);

        // Further operations on archiveEntries list
        archiveEntries.remove(entry2);
        System.out.println("Remaining entries after removal:");
        for (ArArchiveEntry archiveEntry : archiveEntries) {
            System.out.println("Archive Entry: " + archiveEntry.getName() + ", Size: " + archiveEntry.getSize());
        }
    }
}